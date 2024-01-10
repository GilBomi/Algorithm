from collections import deque
# import sys
# sys.stdin=open("input.txt","rt")

n,k=map(int,input().split())
d=deque()
for i in range(1,n+1):
    d.append(i)
n=0
while len(d)!=1:
    for i in range(k-1):
        d.append(d.popleft())
    d.popleft()
print(d[0])