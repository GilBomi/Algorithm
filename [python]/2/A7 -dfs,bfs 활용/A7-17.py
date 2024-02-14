from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,index): # (깊이, 인덱스)
    global answer
    if x==m:
        sum=0
        for h in home:
            mmin=float('inf')
            for r in select:
                mmin=min(mmin,abs(h[0]-r[0])+abs(h[1]-r[1]))
            sum+=mmin
        answer=min(sum,answer)
        return

    for i in range(index,len(pz)):
        select[x]=pz[i]
        dfs(x+1,i+1)
        select[x]=0

if __name__=="__main__":
    n,m=map(int,input().split())
    li=[list(map(int,input().split())) for _ in range(n)]
    pz=[]
    home=[]
    for i in range(n):
        for j in range(n):
            if li[i][j]==1:
                home.append((i,j))
            elif li[i][j]==2:
                pz.append((i,j))
    select=[0]*m
    answer=float('inf')
    dfs(0,0)
    print(answer)
