# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]
num=0
for i in range(n):
    for j in range(n):
        ut=i-1
        dt=i+1
        lt=j-1
        rt=j+1
        if 0<i<n-1:
            if a[ut][j]>=a[i][j] or a[dt][j]>=a[i][j]:
                continue
        elif i==0:
            if a[dt][j]>=a[i][j]:
                continue
        else: # i==n-1
            if a[ut][j]>=a[i][j]:
                continue
        if 0<j<n-1:
            if a[i][lt]>=a[i][j] or a[i][rt]>=a[i][j]:
                continue
        elif j==0:
            if a[i][rt]>=a[i][j]:
                continue
        else: # j==n-1
            if a[i][lt]>=a[i][j]:
                continue
        num+=1
print(num)
