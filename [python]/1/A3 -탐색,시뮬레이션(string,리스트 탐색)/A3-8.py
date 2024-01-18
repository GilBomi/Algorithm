# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=[list(map(int,input().split())) for _ in range(n)]

m=int(input())
b=[list(map(int,input().split())) for _ in range(m)]

for r,d,c in b:
        if d==0: # 왼쪽 방향
            for i in range(c):
                a[r-1].append(a[r-1].pop(0))
        else: # 오른쪽 방향
            for i in range(c):
                a[r-1].insert(0,a[r-1].pop())

print(a)
lt,rt=0,n
sum=0
for i in range(n):
    for x in range(lt,rt):
            sum+=a[i][x]
    if i<n//2:
        lt+=1
        rt-=1
    else:
        lt-=1
        rt+=1
print(sum)


