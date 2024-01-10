import sys
# sys.stdin=open("input.txt","rt")
input=sys.stdin.readline

def dfs(x):
    global cnt
    if x==m:
        print(' '.join(map(str,a)))
        a[x-1]=0
        cnt+=1
        return
    for i in range(1,n+1):
        if a.count(i)==1:
            continue
        a[x]=i
        dfs(x+1)
    a[x-1]=0

if __name__=="__main__":
    n,m=map(int,input().split())
    cnt=0
    a=[0]*m
    dfs(0)
    print(cnt)

