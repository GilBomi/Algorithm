# import sys
# sys.stdin=open("input.txt","rt")

n,c=map(int,input().split())
a=[int(input()) for _ in range(n)]
a.sort()
i=1
j=a[len(a)-1]
res=0
while i<=j:
    mid=(i+j)//2 # 가장 가까운 마굿간 거리의 최대 거리
    num=1
    pre=a[0]
    for ii in range(1,len(a)):
        if a[ii]-pre>=mid:
            num+=1
            pre=a[ii]
    if num>=c:
        res=mid
        i=mid+1
    else:
        j=mid-1
print(res)
