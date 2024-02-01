import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,sum):
    if x==n:
        s=0
        for i in range(n):
            s+=ch[i]*aa[i]
        if s==f:
            return True
    else:
        for i in range(1,n+1):
            if ch.count(i)==1:
                continue
            ch[x]=i
            if dfs(x+1,sum)==True:
                return True
            ch[x]=0


if __name__=="__main__":
    n,f=map(int,input().split())
    ch=[0]*n
    aa=[1]*n
    for i in range(1,n):
        aa[i]=aa[i-1]*(n-i)//i
    dfs(0,0)
    print(' '.join(map(str,ch)))