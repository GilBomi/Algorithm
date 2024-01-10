# import sys
# sys.stdin=open("input.txt","rt")

w=int(input())
a=list(map(int,input().split()))
m=int(input())

for i in range(m):
    a.sort()
    a[0]+=1
    a[w-1]-=1
a.sort()
print(a[w-1]-a[0])