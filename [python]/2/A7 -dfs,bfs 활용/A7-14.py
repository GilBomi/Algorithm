from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    d=deque()
    mmax=0 # 최대 갯수
    for h in range(2,101):
        ch=[[0]*n for _ in range(n)] # 체크한 높이인지 중복 체크(0: 아직 안감)
        cnt=0 # 높이가 h일때 안전영역 갯수
        for i in range(n):
            for j in range(n):
                if li[i][j]>h and ch[i][j]==0:
                    d.append((i,j))
                    ch[i][j]=1
                    cnt+=1
                    while d:
                        now=d.popleft()
                        x=now[0]
                        y=now[1]
                        for xx,yy in ((-1,0),(1,0),(0,-1),(0,1)):
                            dx=x+xx
                            dy=y+yy
                            if 0<=dx<n and 0<=dy<n:
                                if li[dx][dy]>h and ch[dx][dy]==0:
                                    d.append((dx,dy))
                                    ch[dx][dy]=1
        if cnt>mmax:
            mmax=cnt
        if cnt==0:
            break
    print(mmax)


