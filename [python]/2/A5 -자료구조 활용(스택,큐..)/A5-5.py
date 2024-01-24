from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,k=map(int,input().split())
    d=deque([i for i in range(1,n+1)])
    i=0
    while len(d)!=1:
        for i in range(k-1):
            d.append(d.popleft())
        d.popleft()
    print(d.pop())