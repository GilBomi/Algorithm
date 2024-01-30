import sys
# sys.stdin=open("input.txt","rt")


def dfs(x):
    if x==n:
        sum1=0
        sum2=0
        for i in range(n):
            if ch[i]==0:
                sum1+=li[i]
            else:
                sum2+=li[i]
        if sum1==sum2:
            return True
    else:
        ch[x]=1
        if dfs(x+1):
            return True
        ch[x]=0
        if dfs(x+1):
            return True
    

if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    ch=[0 for _ in range(n)]
    bool=dfs(0)
    if bool:
        print("YES")
    else:
        print("NO")