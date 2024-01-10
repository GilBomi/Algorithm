import sys
# sys.stdin=open("input.txt","rt")

def dfs(L,sum):
    global cnt,tot
    if tot+sum<t:
        return
    if sum>t:
        return
    if sum==t:
        cnt+=1
        return
    if L==k:
        return
    for i in range(a[L][1]+1):
        tot-=a[L][0]*a[L][1]
        dfs(L+1,sum+a[L][0]*i)
        tot+=a[L][0]*a[L][1]

if __name__=="__main__":
    t=int(input())
    k=int(input())
    a=[]
    tot=0
    for i in range(k):
        p,n=map(int,input().split())
        a.append((p,n))
        tot+=p*n
    a.sort(reverse=True)
    cnt=0
    dfs(0,0)
    print(cnt)
