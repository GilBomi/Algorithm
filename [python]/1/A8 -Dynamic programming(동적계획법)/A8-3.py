import sys
sys.stdin=open("input.txt","rt")

def dfs(x):
    if dy[x]!=0:
        return dy[x]
    if x==1:
        return 1
    if x==2:
        return 2
    dy[x]=dfs(x-1)+dfs(x-2)
    return dy[x]

if __name__=="__main__":
    n=int(input())
    dy=[0]*(n+1)
    print(dfs(n))

    # bottom-up 방식
    # n=int(input())
    # dy=[0]*(n+2)
    # dy[1]=1
    # dy[2]=2
    # for i in range(3,n+2):
    #     dy[i]=dy[i-1]+dy[i-2]
    # print(dy[n+1])