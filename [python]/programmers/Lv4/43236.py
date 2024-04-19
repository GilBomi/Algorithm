from collections import deque


def solution(distance, rocks, n):
    answer = 0
    rocks.sort()
    rocks.append(distance)
    lt=0
    rt=distance
    while lt<=rt:
        mid=(lt+rt)//2 # 거리의 최솟값 중 최댓값
        # 제거한 바위 갯수 카운팅
        cnt=0
        pre=0
        for rock in rocks:
            if rock-pre<mid:
                cnt+=1
            else: # rock-pre>mid
                pre=rock
        if cnt>n: # 거리의 최솟값 인터벌이 너무 넓으면
            rt=mid-1
        else: # cnt<=n: 정답의 요구사항인 최솟값의 최댓값을 만족함
            answer=mid # while문 벗어나기 위해 한번더 while문 실행되면 lt,rt,mid값이 바뀌므로 꼭 정답 저장해놓기
            lt=mid+1
    return answer

if __name__=="__main__":
    print(solution(25,[2,14,11,21,17],2))