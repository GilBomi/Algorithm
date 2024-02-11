from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    li=list()
    for _ in range(n):
        inp=list(input())
        li.append(list(map(int,inp)))
    ch=[[0]*n for _ in range(n)] # 이미 센 집인지 체크
    answer=[]
    for i in range(n):
        for j in range(n):
            if ch[i][j]==0 and li[i][j]==1: # 아직 안 센 집이라면
                d=deque()
                d.append((i,j))
                ch[i][j]=1
                cnt=1 # 한 단지에서의 집의 갯수
                while d:
                    now=d.popleft()
                    x=now[0]
                    y=now[1]
                    for xx,yy in ((-1,0),(1,0),(0,-1),(0,1)):
                        dx=x+xx
                        dy=y+yy
                        if 0<=dx<n and 0<=dy<n:
                            if ch[dx][dy]==0 and li[dx][dy]==1: # 아직 세지 않은 집이라면
                                ch[dx][dy]=1
                                d.append((dx,dy))
                                cnt+=1
                answer.append(cnt)
    answer.sort()
    print(len(answer))
    for x in answer:
        print(x)