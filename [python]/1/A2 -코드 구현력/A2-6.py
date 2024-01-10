# import sys
# sys.stdin=open("input.txt","rt")

def digit_sum(x):
    sum=0
    for i in x:
        sum+=int(i)
    return sum

n=int(input())
a=input().split()
max=0
for i in range(len(a)):
    d=digit_sum(a[i])
    if max<d:
        max=d
        an=i
print(a[an])
