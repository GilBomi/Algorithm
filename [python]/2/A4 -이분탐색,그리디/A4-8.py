import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,m=map(int,input().split())
    li=list(map(int,input().split()))
    li.sort()
    arr=[0 for _ in range(n)] # 0: 구명보트에 안탐, 1: 구명 보트에 탐
    num=0
    for i in range(n):
        for j in range(n-1,i,-1):
            if arr[i]==0 and arr[j]==0:
                if li[i]+li[j]<=m:
                    arr[i]=1
                    arr[j]=1
                    num+=1
                    # print(i,j)
    for i in range(n):
        if arr[i]==0:
            num+=1
    print(num)
    