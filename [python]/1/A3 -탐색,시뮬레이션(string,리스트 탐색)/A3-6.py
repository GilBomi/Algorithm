# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=[i for i in range(n)]

for i in range(n):
    a[i]=list(map(int,input().split()))
max=0
sum=[0]*4
for i in range(n):
    sum[0]=0
    sum[1]=0
    for j in range(n):
        sum[0]+=a[i][j]
        sum[1]+=a[j][i]
        if i==j:
            sum[2]+=a[i][j]
        if i+j==n-1:
            sum[3]+=a[i][j]
    if max<sum[0]:
        max=sum[0]
    if max<sum[1]:
        max=sum[1]
if max<sum[2]:
    max=sum[2]
if max<sum[3]:
    max=sum[3]
print(max)


