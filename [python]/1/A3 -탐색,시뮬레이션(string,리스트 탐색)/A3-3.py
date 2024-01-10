# import sys
# sys.stdin=open("input.txt","rt")

arr=[str(x) for x in range(1,21)]
for i in range(10):
    a,b=map(int,input().split())
    for j in range((b-a)//2+1):
        arr[a+j-1],arr[b-j-1]=arr[b-j-1],arr[a+j-1]
print(' '.join(arr))
