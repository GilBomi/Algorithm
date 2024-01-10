# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=[list(map(int,input().split())) for i in range(n)]

sum=0
cnt=n//2
for i in range(n):
    for j in range(n):
            if j>=abs(cnt) and j<n-abs(cnt):
                sum+=a[i][j]
    cnt-=1
print(sum)