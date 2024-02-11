from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


def dfs(x,y):
    global cnt
    if x==6 and y==6:
        cnt+=1
        return
    for xx,yy in ((-1,0),(1,0),(0,-1),(0,1)):
        dx=x+xx
        dy=y+yy
        if 0<=dx<7 and 0<=dy<7:
            if li[dx][dy]==0 and ch[dx][dy]==0: # 안 간 길이면
                ch[dx][dy]=1
                dfs(dx,dy)
                ch[dx][dy]=0



if __name__=="__main__":
    li=list()
    for _ in range(7):
        li.append(list(map(int,input().split())))
    ch=[[0]*7 for _ in range(7)] # 갔던 길 체크
    ch[0][0]=1
    cnt=0
    dfs(0,0)
    print(cnt)