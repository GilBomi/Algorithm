from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

dx=[-1,0,1,0]
dy=[0,-1,0,1]

def dfs(L,S):
    global mmin
    if L==m:
        sum=0
        for h in hou:
            dis=float('inf')
            for r in res:
                dis=min(dis,abs(h[0]-r[0])+abs(h[1]-r[1]))
            sum+=dis
        mmin=min(sum,mmin)
        return
    for i in range(S,len(pizz)):
        res.append(pizz[i])
        dfs(L+1,i+1)
        res.pop()

if __name__=="__main__":
    n,m=map(int,input().split())
    a=[list(map(int,input().split())) for _ in range(n)]
    pizz=[]
    hou=[]
    for i in range(n):
        for j in range(n):
            if a[i][j]==2:
                pizz.append((i,j)) # (행,열)
            elif a[i][j]==1:
                hou.append((i,j))
    res=[]
    mmin=float('inf')
    dfs(0,0)
    print(mmin)
    
    