import sys
sys.stdin=open("input.txt","rt")
input=sys.stdin.readline

def dfs(x):
    global cnt
    if x==n:
        cnt+=1
        return
    for i in range(1,n+1):
        if ch[i]==0 and g[x-1][i-1]==1:
            ch[i]=1
            dfs(i)
            ch[i]=0


if __name__=="__main__":
    n,m=map(int,input().split())
    g=[[0]*n for _ in range(n)]
    for i in range(m):
        a,b=map(int,input().split())
        g[a-1][b-1]=1
    cnt=0
    ch=[0]*(n+1) # 중복체크
    ch[1]=1
    dfs(1)
    print(cnt)