from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    a=[list(map(int,input().split())) for _ in range(n)]
    dx=[-1,0,1,0,1,1,-1,-1]
    dy=[0,-1,0,1,1,-1,-1,1]
    d=deque()
    cnt=0
    for ii in range(n):
        for jj in range(n):
            if a[ii][jj]==1:
                d.append((ii,jj))
                cnt+=1
                while d:
                    now=d.popleft()
                    for i in range(8):
                        x=dx[i]+now[0]
                        y=dy[i]+now[1]
                        if 0<=x<n and 0<=y<n and a[x][y]==1:
                            a[x][y]=0
                            d.append((x,y))
    print(cnt)