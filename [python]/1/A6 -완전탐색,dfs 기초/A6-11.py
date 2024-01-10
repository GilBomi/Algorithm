import sys
# sys.stdin=open("input.txt","rt")
input=sys.stdin.readline

def dfs(L,S,sum):
    global cnt
    if L==k:
        if sum%m==0:
            cnt+=1
        return
    for i in range(S,n):
        dfs(L+1,i+1,sum+a[i])


if __name__=="__main__":
    n,k=map(int,input().split())
    a=list(map(int,input().split()))
    m=int(input())

    cnt=0
    dfs(0,0,0)
    print(cnt)

