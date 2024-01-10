# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=[]
for i in range(n):
    s,e=map(int,input().split())
    a.append((s,e))
a.sort(key=lambda x:(x[1],x[0]))

num=1
t=a[0][1]
for x in range(1,len(a)):
    if a[x][0]>=t:
        t=a[x][1]
        num+=1
print(num)

