import sys
# sys.stdin=open("input.txt","rt")


def dfs(x):
    global count
    if x==m:
        for a in ch:
            print(a,end=' ')
        print()
        count+=1
        return
    for i in range(1,n+1):
        if any(a==i for a in ch):
            continue
        ch[x]=i
        dfs(x+1)
        ch[x]=0


if __name__=="__main__":
    n,m=map(int,input().split())
    ch=[0]*m
    count=0
    dfs(0)
    print(count)