import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,sum):
    global minn
    if x>minn:
        return
    if sum==m:
        if x<minn:
            minn=x
        return
    for i in range(n):
        if sum+li[i]>m:
            continue
        else:
            dfs(x+1,sum+li[i])


if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    m=int(input())
    li.sort(reverse=True)
    minn=float('inf')
    dfs(0,0)
    print(minn)


            