import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,s): # (깊이,res 인덱스 번호)
    global cnt
    if x==k:
        if sum(res)%m==0:
            cnt+=1
        return
    for i in range(s,n):
        res[x]=li[i]
        dfs(x+1,i+1)


if __name__=="__main__":
    n,k=map(int,input().split())
    li=list(map(int,input().split()))
    m=int(input())
    res=[0]*k
    cnt=0
    dfs(0,0)
    print(cnt)
