from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    a=[list(map(int,input().split())) for _ in range(n)]
    d=deque()
    dx=[-1,0,1,0]
    dy=[0,-1,0,1]
    an=0 # 정답
    ch=[[0]*n for _ in range(n)] # 중복 체크
    
    for dep in range(1,101):
        mmax=0
        for i in range(n):
            for j in range(n):
                if a[i][j]>=dep and ch[i][j]==0: # d에 쌓이지 않았을때
                    d.append((i,j))
                    ch[i][j]=1 # d에 쌓인 곳이라고 체크
                    mmax+=1
                    while d:
                        now=d.popleft()
                        for k in range(4):
                            x=dx[k]+now[0]
                            y=dy[k]+now[1]
                            if 0<=x<n and 0<=y<n and a[x][y]>=dep:
                                if ch[x][y]==0: # d에 쌓이지 않았을때
                                    d.append((x,y))
                                    ch[x][y]=1 # d에 쌓인 곳이라고 체크
        if mmax==0:
            break
        if mmax>an:
            an=mmax
        ch=[[0]*n for _ in range(n)]
    print(an)