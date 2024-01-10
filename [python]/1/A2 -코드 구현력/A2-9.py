# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
arMax=0
for i in range(n):
    a=list(map(int,input().split()))
    num=1
    eq=0
    for j in range(3):
        for k in range(j+1,3):
            if a[j]==a[k]:
                num+=1
                eq=a[j]
    if num==1:
        money=max(a)*100
    elif num==2:
        money=1000+eq*100
    else:
        money=10000+eq*1000
    if arMax<money:
        arMax=money
print(arMax)


