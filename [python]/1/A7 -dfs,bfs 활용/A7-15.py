from asyncio.windows_events import NULL
from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    m,n=map(int,input().split())
    a=[list(map(int,input().split())) for _ in range(n)]
    d=deque()
    cnt=0
    dx=[-1,0,1,0]
    dy=[0,-1,0,1]

    for i in range(n):  
        for j in range(m):
            flag=True 
            if a[i][j]==0:
                for k in range(4):
                    x=dx[k]+j
                    y=dy[k]+i
                    if 0<=x<m and 0<=y<n:
                        if a[y][x]!=-1:
                            flag=False
                if flag:
                    print(-1)
                    sys.exit(0)
                     
    while True:
        ch=[[0]*m for _ in range(n)]
        cnt+=1
        flag=0
        for i in range(n):
            for j in range(m):
                if a[i][j]==1 and ch[i][j]==0:
                    ch[i][j]=1
                    for k in range(4):
                        x=dx[k]+j
                        y=dy[k]+i
                        if 0<=x<m and 0<=y<n:
                            if a[y][x]==0 and ch[y][x]==0:
                                a[y][x]=1
                                ch[y][x]=1
            if a[i].count(0)!=0:
                flag=1
        if flag==0:
            print(cnt)
            break
                                    


