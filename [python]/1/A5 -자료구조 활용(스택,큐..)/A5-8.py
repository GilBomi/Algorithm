
# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=[]
for i in range(n):
    a.append(input())
a.sort()
b=[]
for i in range(n-1):
    b.append(input())
b.sort()
for i in range(n-1):
    if a[i]!=b[i]:
        print(a[i])
        break
else:
    print(a[len(a)-1])