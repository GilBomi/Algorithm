# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=[]
for _ in range(n):
    h,w=map(int,input().split())
    a.append((h,w))
a.sort()
num=0
flag=True
for i in range(n):
    for j in range(i+1,n):
        if a[i][1]<=a[j][1]:
            break
    else:
        num+=1
print(num)




