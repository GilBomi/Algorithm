# import sys
# sys.stdin=open("input.txt","rt")

k,n=map(int,input().split())
a=[int(input()) for _ in range(k)]
n_max=0 # 최대 길이(정답)
i=1
j=max(a)
while i<=j:
    sum=0
    mid=(i+j)//2 # 최대 길이
    for x in a:
        sum+=x//mid
    if sum>=n:
        if n_max<mid:
            n_max=mid
            i=mid+1
    else:
        j=mid-1

print(n_max)
