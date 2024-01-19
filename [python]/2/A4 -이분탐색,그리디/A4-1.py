import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,m=map(int,input().split())
    li=list(map(int,input().split()))
    li.sort()
    lt,rt=0,n-1
    while lt<=rt:
        mid=(lt+rt)//2
        if li[mid]<m:
            lt=mid+1
        elif li[mid]>m:
            rt=mid-1
        else:
            print(mid+1)
            break