from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def dfs(x):
    if dy[x]!=0:
        return dy[x]
    if x==1 or x==2:
        return x
    dy[x]=dfs(x-1)+dfs(x-2)
    return dy[x]

if __name__=="__main__":
    n=int(input())
    dy=[0]*(n+1)
    print(dfs(n))