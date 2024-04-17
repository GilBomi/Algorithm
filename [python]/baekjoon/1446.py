from collections import deque
import heapq


if __name__=="__main__":
    n,d=map(int,input().split())
    graph=[[] for _ in range(d+1)]
    distance=[float('inf')]*(d+1)
    for i in range(d):
        graph[i].append((i+1,1))
    for i in range(n):
        start,end,dist=map(int,input().split())
        if end>d:
            continue
        graph[start].append((end,dist))
    
    distance[0]=0
    heap=[]
    heapq.heappush(heap,(0,0)) # (현재 위치, 길이) 
    while heap:
        now,dist=heapq.heappop(heap)
        if dist>distance[now]:
            continue
        for node in graph[now]:
            if distance[node[0]]>dist+node[1]:
                distance[node[0]]=dist+node[1]
                heapq.heappush(heap,(node[0],distance[node[0]]))
    print(distance[d])
