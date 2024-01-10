# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=list(map(int,input().split()))

cnt=[]
for i in range(len(a)-1,-1,-1):
    cnt.insert(a[i],str(i+1))
print(' '.join(cnt))