from collections import deque
from copy import copy
# import sys
# sys.stdin=open("input.txt","rt")

ss=input()
n=int(input())

for i in range(n):
    d=deque(input())
    s=deque(ss)
    flag=True
    while d:
        d0=d.popleft()
        if any(d0==s[i] for i in range(len(s))):
            if s[0]==d0:
                s.popleft()
            else:
                flag=False
                break
    if flag==False or len(s)!=0:
        print('#%d NO' %(i+1))
    else:
        print('#%d YES' %(i+1))
        
