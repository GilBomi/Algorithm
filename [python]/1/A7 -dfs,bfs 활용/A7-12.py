from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,y):
    global cnt
    cnt+=1
    a[x][y]=0
    for i in range(4):
        xx=dx[i]+x
        yy=dy[i]+y
        if 0<=xx<n and 0<=yy<n:
            if a[xx][yy]==1:
                dfs(xx,yy)

if __name__=="__main__":
    n=int(input())
    a=[list(map(int,input())) for _ in range(n)]
    an=[]
    dx=[-1,0,1,0]
    dy=[0,-1,0,1]
    
    for i in range(n):
        for j in range(n):
            if a[i][j]==1:
                cnt=0
                dfs(i,j)
                an.append(cnt)

    print(len(an))
    an.sort()
    for x in an:
        print(x)