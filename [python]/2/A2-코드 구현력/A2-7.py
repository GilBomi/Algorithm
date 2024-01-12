import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=[0 for _ in range(0,n+1)] # 0: 소수, 1: 소수 아님
    num=0
    for i in range(2,n+1):
        j=2
        while i*j<=n:
            if li[i*j]==1:
                j+=1
                continue
            elif li[i*j]==0:
                li[i*j]=1
                num+=1
            j+=1
    print(n-num-1)

