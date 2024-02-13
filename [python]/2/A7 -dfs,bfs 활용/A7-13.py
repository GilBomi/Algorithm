from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    li=list()
    for _ in range(n):
        li.append(list(map(int,input().split())))
    d=deque()
    cnt=0
    for i in range(n):
        for j in range(n):
            if li[i][j]==1:
                d.append((i,j))
                li[i][j]=0
                while d:
                    now=d.popleft()
                    x=now[0]
                    y=now[1]
                    for xx,yy in ((-1,-1),(-1,1),(1,-1),(1,1),(-1,0),(1,0),(0,-1),(0,1)):
                        dx=x+xx
                        dy=y+yy
                        if 0<=dx<n and 0<=dy<n:
                            if li[dx][dy]==1:
                                d.append((dx,dy))
                                li[dx][dy]=0
                cnt+=1
    print(cnt)
                


            