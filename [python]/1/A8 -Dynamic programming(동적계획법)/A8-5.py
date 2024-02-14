
import copy
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    a=list(map(int,input().split()))
    a.insert(0,0)
    b=copy.deepcopy(a)
    a.sort()
    dy=[0]*(n+1)
    # for i in range(1,n+1):
    #     mmax=0
    #     for j in range(1,n+1):
    #         if b[j]==a[i]:
    #             break
    #         if a[i]>b[j]:
    #             if mmax<dy[b[j]]:
    #                 mmax=dy[b[j]]
    #     # if mmax==0:
    #     #     dy[i]=dy[i-1]
    #     # else:
    #     dy[i]=mmax+1

    # LIS 방식(A8-4.py)
    for i in range(1,n+1):
        mmax=0
        for j in range(1,i):
            if b[j]<b[i]:
                if mmax<dy[j]:
                    mmax=dy[j]
        dy[i]=mmax+1
        
    print(max(dy))

