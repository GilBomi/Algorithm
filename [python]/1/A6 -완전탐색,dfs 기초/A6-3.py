# import sys
# sys.stdin=open("input.txt","rt")

def dfs(x):
    if x==n+1:
        for i in range(1,len(ch)):
            if ch[i]==1:
                print(i,end=' ')
        print()
        return
    ch[x]=1
    dfs(x+1)
    ch[x]=0
    dfs(x+1)
    

n=int(input())
ch=[0]*(n+1)
dfs(1)