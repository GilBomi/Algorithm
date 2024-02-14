from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,y): # (행,열)
    global cnt
    if x==0:
        cnt=y
        return 
    flag=False
    for xx,yy in ((0,1),(0,-1)):
        dx=xx+x
        dy=yy+y
        if 0<=dx<10 and 0<=dy<10:
            if li[dx][dy]==1 and ch[dx][dy]==0:
                flag=True
                ch[dx][dy]=1
                dfs(dx,dy)
    if flag==False:
        dx=x-1
        dy=y
        if 0<=dx<10 and 0<=dy<10:
            if li[dx][dy]==1 and ch[dx][dy]==0:
                ch[dx][dy]=1
                dfs(dx,dy)

if __name__=="__main__":
    li=[list(map(int,input().split())) for _ in range(10)]
    cnt=0
    ii=0
    ch=[[0]*10 for _ in range(10)] # 갔던 길인지 중복 체크(0:아직 안감)
    for i in range(10):
        if li[9][i]==2:
            ii=i
            break
    ch[9][ii]=1
    dfs(9,ii)
    print(cnt)
            
    