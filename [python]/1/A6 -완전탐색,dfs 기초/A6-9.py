import sys
# sys.stdin=open("input.txt","rt")
input=sys.stdin.readline

def sum():
    sum=0
    for i in range(n):
        sum+=a[i]*b[i]
    return sum

def dfs(L):
    global a,flag
    if flag==1:
        return
    if L==n:
        if sum()==f:
            print(' '.join(map(str,a)))
            flag=1
        return
    for i in range(1,n+1):
        if ch[i]==0:
            ch[i]=1
            a[L]=i
            dfs(L+1)            
            ch[i]=0


if __name__=="__main__":
    n,f=map(int,input().split())
    ch=[0]*(n+1) # 중복 판별을 위한 리스트
    a=[0]*n # 수열 순서를 위한 리스트
    b=[0]*n
    flag=0
    for i in range(n):
        k=1
        for j in range(i):
            k*=(3-j)
        for j in range(i,0,-1):
            k/=j
        b[i]=int(k)
    dfs(0)