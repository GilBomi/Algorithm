import heapq
import sys
sys.stdin=open("input.txt","rt")

heap=[]
while True:
    n=int(input())
    if n==0:
        print(heapq.heappop(heap))
    elif n==-1:
        break
    else:
        heapq.heappush(heap,n)
    print(n,heap)