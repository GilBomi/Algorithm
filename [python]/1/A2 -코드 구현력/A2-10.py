# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=list(map(int,input().split()))
pre=0
k=0
sum=0
for i in a:
    if pre==1 and i==1:
        k+=1
        sum+=k
    elif pre==0 and i==1:
        k+=1
        sum+=1
        pre=1
    elif pre==0 and i==0:
        k=0
        pre=0
    else:
        pre=0
        k=0
print(sum)
    
