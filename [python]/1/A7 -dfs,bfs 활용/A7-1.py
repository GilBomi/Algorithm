import sys
# sys.stdin=open("input.txt","rt")

def dfs(s,t,ii): # (점수합,시간합)
    global max,sum
    if t>m:
        return
    if max<s:
        max=s
    # if max<sum:
    #     max=sum
    for i in range(ii,n):
        if ch[i]==0:
            ch[i]=1
            # sum+=a[i][0]
            dfs(s+a[i][0],t+a[i][1],i+1)
            ch[i]=0
            # sum-=a[i][0]

if __name__=="__main__":
    n,m=map(int,input().split())
    a=[]
    for i in range(n):
        s,t=map(int,input().split())
        a.append((s,t))
    max=0
    ch=[0]*n
    dfs(0,0,0)
    
    # sum=0
    # dfs(0,0)
    print(max)
