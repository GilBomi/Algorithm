from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    dy=[0]*(n) # 최대 길이 저장하는곳
    dy[0]=1
    for i in range(1,n):
        mmax=0
        for j in range(0,i):
            if li[i]>li[j] and mmax<dy[j]:
                mmax=dy[j]
        if mmax==0:
            dy[i]=1
        else:
            dy[i]=mmax+1
    print(max(dy))
        