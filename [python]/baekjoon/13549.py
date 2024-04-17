from collections import deque
import heapq


if __name__=="__main__":
    n,k=map(int,input().split())
    time=[float('inf')]*100001
    time[n]=0 # n에 대한 시간을 0으로 초기화
    heap=[]
    heapq.heappush(heap,(n,0)) # (도착 지점, 시간)
    while heap:
        now,t=heapq.heappop(heap)
        if t>time[now]:
            continue
        for x,y in ((now+1,1),(now-1,1),(now*2,0)):
            if 0<=x<=100000 and y+t<time[x]:
                time[x]=y+t
                heapq.heappush(heap,(x,y+t))
    print(time[k])
