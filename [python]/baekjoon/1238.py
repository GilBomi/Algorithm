from collections import deque
import heapq


if __name__=="__main__":
    n,m,x=map(int,input().split())
    graph=[[] for _ in range(n+1)]
    for _ in range(m):
        s,e,t=map(int,input().split())
        graph[s].append((e,t))

    def dijkstra(start,end):
        distance=[float('inf')]*(n+1)
        heap=[(0,start)] # (거리,현재 위치)
        distance[start]=0
        while heap:
            dist,now=heapq.heappop(heap)
            if distance[now]<dist:
                continue
            for next in graph[now]:
                dd=dist+next[1]
                if dd<distance[next[0]]:
                    distance[next[0]]=dd
                    heapq.heappush(heap,(dd,next[0]))
        return distance[end]
    
    maxx=0
    for i in range(1,n+1):
        dist=dijkstra(i,x)+dijkstra(x,i)
        maxx=max(maxx,dist)
    print(maxx)