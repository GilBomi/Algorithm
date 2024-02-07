import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,s,s_sum,t_sum): # (깊이,현재 인덱스,시간 합,점수 합)
    global maxx
    if maxx<t_sum:
        maxx=t_sum
    if x==n:
        return
    for i in range(s,n):
        if s_sum+li[i][1]<=m:
            dfs(x+1,i+1,s_sum+li[i][1],t_sum+li[i][0])
    
if __name__=="__main__":
    n,m=map(int,input().split())
    li=[0]*n
    for i in range(n):
        s,t=map(int,input().split())
        li[i]=(s,t)
    maxx=0
    dfs(0,0,0,0)
    print(maxx)
    