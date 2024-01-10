import heapq
import sys
sys.stdin=open("input.txt","rt")

heap=[]
while True:
    n=int(input())
    if n==0:
        if len(heap)==0:
            print(-1)
        else:
            print((-1)*heapq.heappop(heap))
    elif n==-1:
        break
    else:
        heapq.heappush(heap,-n)
    print(n,heap)