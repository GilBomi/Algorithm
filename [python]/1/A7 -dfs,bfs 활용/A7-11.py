import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,y):
    global cnt
    if x==x_max and y==y_max:
        cnt+=1
        return
    for i in range(4):
        xx=dx[i]+x
        yy=dy[i]+y
        if 0<=xx<n and 0<=yy<n and ch[xx][yy]==0:
            if a[x][y]<a[xx][yy]:
                ch[xx][yy]=1
                dfs(xx,yy)
                ch[xx][yy]=0
    

if __name__=="__main__":
    n=int(input())
    a=[list(map(int,input().split())) for _ in range(n)]
    mmin=float('inf')
    x_min=0
    y_min=0
    mmax=float('-inf')
    x_max=0
    y_max=0
    for i in range(n):
        for j in range(n):
            if a[i][j]<mmin:
                mmin=a[i][j]
                x_min=i
                y_min=j
            if a[i][j]>mmax:
                mmax=a[i][j]
                x_max=i
                y_max=j
    cnt=0
    ch=[[0]*n for _ in range(n)] # 중복 체크
    ch[x_min][y_min]=1
    dx=[-1,0,1,0]
    dy=[0,-1,0,1]
    dfs(x_min,y_min)
    print(cnt)