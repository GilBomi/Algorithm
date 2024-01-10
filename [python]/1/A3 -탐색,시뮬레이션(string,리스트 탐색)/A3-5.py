# import sys
# sys.stdin=open("input.txt","rt")

n,m=map(int,input().split())
a=list(map(int,input().split()))
num=0
# for i in range(n):
#     if a[i]==m:
#         num+=1
#         continue
#     sum=a[i]
#     for j in range(i+1,n):
#         sum+=a[j]
#         if sum==m:
#             num+=1
#             break
#         elif sum>m:
#             break
i,j=0,1
sum=a[i]
while i<n:
    if sum<m:
        if i==j:
            j+=1
        elif j==n:
            sum-=a[i]
            i+=1
        else:
            sum+=a[j]
            j+=1
    elif sum==m:
        num+=1
        sum-=a[i]
        i+=1
    else: # sum>m
        sum-=a[i]
        i+=1
print(num)
