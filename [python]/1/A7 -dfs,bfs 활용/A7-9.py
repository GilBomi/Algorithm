
from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    a=[list(map(int,input().split())) for _ in range(7)]
    d=deque()
    d.append((0,0))
    dx=[-1,0,1,0]
    dy=[0,-1,0,1]
    ch=[[0]*7 for i in range(7)] # 중복 체크
    ch[0][0]=1
    L=0

    while True:
        leng=len(d)
        for i in range(leng):
            now=d.popleft()
            if now[0]==6 and now[1]==6:
                print(L)
                sys.exit(0)
            for j in range(4):
                x=now[0]+dx[j]
                y=now[1]+dy[j]
                if 0<=x<7 and 0<=y<7:
                    if ch[x][y]==0 and a[x][y]==0:
                        ch[x][y]=1
                        d.append((x,y))
        if len(d)==0:
            print(-1)
            sys.exit(0)
        L+=1
    print(L)


