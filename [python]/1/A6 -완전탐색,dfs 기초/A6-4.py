import sys
sys.stdin=open("input.txt","rt")

def dfs(i):
    if i==n:
        s1=0
        s2=0
        for ii in range(n):
            if ch[ii]==0:
                s1+=a[ii]
            else:
                s2+=a[ii]
        if s1==s2:
            return True
        return
    ch[i]=0
    if dfs(i+1):
        return True
    ch[i]=1
    if dfs(i+1):
        return True

if __name__=="__main__":
    n=int(input())
    a=list(map(int,input().split()))
    ch=[0]*n
    d=dfs(0)
    if d:
        print('YES')
    else:
        print('NO')
    