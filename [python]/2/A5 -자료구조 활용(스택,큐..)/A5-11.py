from collections import deque
import heapq
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    h=[]
    while True:
        n=int(input())
        if n==-1:
            break
        elif n==0:
            print((-1)*heapq.heappop(h))
        else:
            heapq.heappush(h,-n)
        