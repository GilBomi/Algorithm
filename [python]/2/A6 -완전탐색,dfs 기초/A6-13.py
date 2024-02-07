import sys
# sys.stdin=open("input.txt","rt")

def dfs(x): # (현재 경로 인덱스 값)
    global cnt
    if x==n-1:
        cnt+=1
        return
    for i in range(n):
        if li[x][i]==1: # 연결되어있는 경로면
            if ch[i]==0: # 가지 않은 경로면
                ch[i]=1
                dfs(i)
                ch[i]=0

if __name__=="__main__":
    n,m=map(int,input().split())
    li=[[0]*n for _ in range(n)]
    for i in range(m):
        a,b=map(int,input().split())
        li[a-1][b-1]=1
    ch=[0 for _ in range(n)] # 1: 이미 통과한 경로
    ch[0]=1
    cnt=0
    dfs(0)
    print(cnt)