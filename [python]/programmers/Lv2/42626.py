import heapq

def solution(scoville, K):
    answer=0
    scoville=scoville
    heapq.heapify(scoville)
    # print(scoville[0])
    while True:
        if scoville[0]>=K:
            break
        if len(scoville)==1:
            heapq.heappop(scoville)
            break
        a=heapq.heappop(scoville)
        b=heapq.heappop(scoville)
        heapq.heappush(scoville,a+b*2)
        answer+=1
    if len(scoville)==0:
        return -1
    return answer

if __name__=="__main__":
    print(solution([1, 2, 3, 9, 10, 12],7))