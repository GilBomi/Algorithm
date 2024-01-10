
# import sys
# sys.stdin=open("input.txt","rt")

n,m=map(int,input().split())
a=[0 for _ in range(n+m+1)]
for i in range(1,n+1):
    for j in range(1,m+1):
        a[i+j]+=1
max=0
for i in a:
    if max<i:
        max=i
for i in range(len(a)):
    if max==a[i]:
        print(i,end=' ')