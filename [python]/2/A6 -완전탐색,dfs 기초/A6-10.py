import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,nn): # (깊이,현재값)
    global cnt
    if x==m:
        for k in li:
            print(k,end=' ')
        print()
        cnt+=1
        return
    for i in range(nn,n+1):
        li[x]=i
        dfs(x+1,i+1)
        # li[x]=0
        


if __name__=="__main__":
    n,m=map(int,input().split())
    li=[0]*m
    cnt=0
    dfs(0,1)
    print(cnt)