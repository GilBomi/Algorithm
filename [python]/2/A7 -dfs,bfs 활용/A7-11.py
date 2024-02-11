from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,y):
    global cnt
    if x==mmax_dx and y==mmax_dy:
        cnt+=1
        return
    for xx,yy in ((-1,0),(1,0),(0,-1),(0,1)):
        dx=x+xx
        dy=y+yy
        if 0<=dx<n and 0<=dy<n:
            if ch[dx][dy]==0 and li[x][y]<li[dx][dy]: # 안 간 길이고 높이 체크
                ch[dx][dy]=1
                dfs(dx,dy)
                ch[dx][dy]=0


if __name__=="__main__":
    n=int(input())
    li=list()
    mmin=float('inf')
    mmin_dx=0
    mmin_dy=0
    mmax=float('-inf')
    mmax_dx=0
    mmax_dy=0
    for i in range(n):
        input1=list(map(int,input().split()))
        for j in range(n):
            if mmin>input1[j]:
                mmin=input1[j]
                mmin_dx=i
                mmin_dy=j
            if mmax<input1[j]:
                mmax=input1[j]
                mmax_dx=i
                mmax_dy=j
        li.append(input1)
    cnt=0
    ch=[[0]*n for _ in range(n)] # 간 길 체크
    ch[mmin_dx][mmin_dy]=1
    dfs(mmin_dx,mmin_dy)
    print(cnt)