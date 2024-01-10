# import sys
# sys.stdin=open("input.txt","rt")

def dfs(i,x):
    global cnt
    res[i]=x
    if i==m-1:
        print(' '.join(map(str,res)))
        cnt+=1
        return
    for k in range(1,n+1):
        dfs(i+1,k)
    


if __name__=="__main__":
    n,m=map(int,input().split())
    res=[0]*m
    cnt=0
    for x in range(1,n+1):
        dfs(0,x)
    print(cnt)