import sys
sys.stdin=open("input.txt","rt")

k,n=map(int,input().split())
cnt=0
for i in range(1,k+1):
    if k%i==0:
        cnt+=1
        if cnt==n:
            print(i)
            break
else:
    print(-1)
