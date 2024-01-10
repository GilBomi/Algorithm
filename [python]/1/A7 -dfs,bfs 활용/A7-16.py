from asyncio.windows_events import NULL
from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

dx=[-1,1,0]
dy=[0,0,-1]

def dfs(y,x):
    if y==0:
        return x

    for i in range(2):
        xx=dx[i]+x
        yy=dy[i]+y
        if 0<=xx<10 and 0<=yy<10 and a[yy][xx]!=0:
            if ch[yy][xx]==0:
                ch[yy][xx]=1
                return dfs(yy,xx)
    else:
        xx=dx[2]+x
        yy=dy[2]+y
        if 0<=xx<10 and 0<=yy<10 and a[yy][xx]!=0:
            if ch[yy][xx]==0:
                ch[yy][xx]=1
                return dfs(yy,xx)


if __name__=="__main__":
    a=[list(map(int,input().split())) for _ in range(10)]
    ch=[[0]*10 for _ in range(10)] # 중복 체크
    for i in range(10):
        if a[9][i]==2:
            ch[9][i]=1
            print(dfs(9,i))
                