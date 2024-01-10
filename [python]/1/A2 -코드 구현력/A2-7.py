# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=[1 for _ in range(n+1)]
a[0],a[1]=0,0

for i in range(2,n+1):
    j=2
    while i*j<=n:
        if a[i*j]==1:
            a[i*j]=0
        j+=1
num=0
for i in a:
    if i==1:
        num+=1
print(num)
