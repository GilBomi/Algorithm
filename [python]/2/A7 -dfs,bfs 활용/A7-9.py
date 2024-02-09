from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    li=list()
    for _ in range(7):
        li.append(list(map(int,input().split())))
    ch=[[0]*7 for _ in range(7)] # 중복 체크. 0이면 안간곳
    d=deque()
    d.append((0,0))
    ch[0][0]=1
    while d:
        now=d.popleft()
        dy=now[0]
        dx=now[1]
        if dx==6 and dy==6:
            print(ch[6][6]-1)
            sys.exit(0)
        for yy,xx in ((dy+1,dx),(dy-1,dx),(dy,dx+1),(dy,dx-1)):
            if 0<=yy<7 and 0<=xx<7:
                if ch[yy][xx]==0 and li[yy][xx]==0:
                    ch[yy][xx]=ch[dy][dx]+1
                    d.append((yy,xx))
    print(-1)