import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,m=map(int,input().split())
    a=[0]*(n+m+1)
    max=0
    for i in range(1,n+1):
        for j in range(1,m+1):
            a[i+j]+=1
            if max<a[i+j]:
                max=a[i+j]
    for i in range(len(a)):
        if max==a[i]:
            print(i,end=' ')
