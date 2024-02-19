from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,y):
    if dyn[x][y]>0:
        return dyn[x][y]
    if x==0 and y==0:
        return li[x][y]
    elif y==0:
        dyn[x][y]=dfs(x-1,y)+li[x][y]
    elif x==0:
        dyn[x][y]=dfs(x,y-1)+li[x][y]
    else:
        dyn[x][y]=min(dfs(x-1,y),dfs(x,y-1))+li[x][y]
    return dyn[x][y]

if __name__=="__main__":
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    dyn=[[0]*n for _ in range(n)]
    dfs(n-1,n-1)
    print(dyn[n-1][n-1])
