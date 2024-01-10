import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,y):
    global cnt
    if x==6 and y==6:
        cnt+=1
        return
    for i in range(4):
        xx=dx[i]+x
        yy=dy[i]+y
        if 0<=xx<7 and 0<=yy<7:
            if ch[xx][yy]==0 and a[xx][yy]==0:
                ch[xx][yy]=1
                dfs(xx,yy)
                ch[xx][yy]=0
                
if __name__=="__main__":
    a=[list(map(int,input().split())) for _ in range(7)]
    ch=[[0]*7 for i in range(7)] # 중복 체크
    ch[0][0]=1
    dx=[-1,0,1,0]
    dy=[0,-1,0,1]
    cnt=0
    dfs(0,0)
    print(cnt)