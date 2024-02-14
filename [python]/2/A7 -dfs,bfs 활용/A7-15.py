from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n,m=map(int,input().split())
    li=[list(map(int,input().split())) for _ in range(m)]
    d=deque()
    ch=[[0]*n for _ in range(m)] # 이미 간 부분인지 중복 체크(0: 아직 안가봄)
    for i in range(m):
        for j in range(n):
            if li[i][j]==1:
                d.append((i,j))
                ch[i][j]=0
    if len(d)==0:
        print(0)
        sys.exit(0)
    cnt=0 # 최소 날짜
    while d:
        length=len(d)
        for i in range(length):
            now=d.popleft()
            x=now[0]
            y=now[1]
            for xx,yy in ((-1,0),(1,0),(0,-1),(0,1)):
                dx=x+xx
                dy=y+yy
                if 0<=dx<m and 0<=dy<n:
                    if li[dx][dy]==0 and ch[dx][dy]==0:
                        ch[dx][dy]=ch[x][y]+1
                        d.append((dx,dy))
        cnt+=1
    for i in range(m):
        for j in range(n):
            if li[i][j]==0 and ch[i][j]==0:
                print(-1)
                sys.exit(0)
    print(cnt-1)
    