import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,sum): # (깊이,금액 합)
    global cnt
    if sum>t:
        return
    if sum==t:
        cnt+=1
        return
    if x==k:
        if sum==t:
            cnt+=1
        return
    for i in range(li[x][1]+1):
        dfs(x+1,sum+li[x][0]*i)
    

if __name__=="__main__":
    t=int(input())
    k=int(input())
    li=list()
    for _ in range(k):
        p,n=map(int,input().split())
        li.append((p,n))
    cnt=0
    dfs(0,0)
    print(cnt)
