# import sys
# sys.stdin=open("input.txt","rt")

N,K=map(int,input().split())
c=map(int,input().split())
c=list(c)
res=set()
for i in range(0,N):
    for j in range(i+1,N):
        for h in range(j+1,N):
            res.add(c[i]+c[j]+c[h])

c=list(res)
c.sort(reverse=True)
print(c[K-1])

                