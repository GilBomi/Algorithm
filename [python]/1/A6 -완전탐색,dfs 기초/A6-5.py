import sys
# sys.stdin=open("input.txt","rt")

def dfs(i,sum,tsum):
    global max,total
    if total-tsum+sum<max:
        return
    if i==n:
        if sum>max and sum<=c:
            max=sum
        return
    if sum>c:
        return
    dfs(i+1,sum+a[i],tsum+a[i])
    dfs(i+1,sum,tsum+a[i])

if __name__=="__main__":
    c,n=map(int,input().split())
    a=[]
    for i in range(n):
        a.append(int(input()))
    max=0
    total=sum(a)
    dfs(0,0,0)
    print(max)