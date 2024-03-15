from collections import deque
import heapq

def solution(genres, plays):
    answer = []
    songs=dict()
    heap=[]
    for i in range(len(genres)):
        if genres[i] not in songs:
            songs[genres[i]]=[(plays[i],i)]
            songs[genres[i]+'_sum']=plays[i]
        else:
            songs[genres[i]]+=[(plays[i],i)]
            songs[genres[i]+'_sum']+=plays[i]
    for key in songs.keys():
        if '_sum' not in key:
            songs[key].sort(key=lambda x:(-x[0],x[1])) # x[0]은 내림차순 정렬하고 x[1]은 오름차순 정렬
        else:
            heapq.heappush(heap,(-songs[key],key)) # 최대힙
    print(heap)
    while heap:
        x=heapq.heappop(heap)
        print('x:',x[1][:-4])
        genre=x[1][:-4]
        if len(songs[genre])==1:
            answer.append(songs[genre][0][1])
        else:
            for i in range(2):
                answer.append(songs[x[1][:-4]][i][1])

    return answer

if __name__=="__main__":
    print(solution(["classic", "pop", "classic", "classic", "pop"],[500, 600, 150, 800, 2500]))