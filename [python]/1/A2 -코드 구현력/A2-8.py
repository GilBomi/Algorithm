import sys
sys.stdin=open("input.txt","rt")

n=int(input())
a=list(input().split())
def reverse(x):
    ar=[]
    for j in x:
        ar.insert(0,j)
    s=''
    for i in ar:
        s+=i
    return s
def isPrime(x):
    if x==1:
        return False
    for i in range(2,x//2+1):
        if x%i==0:
            return False
    return True
    # if x==1:
    #     return False
    # for i in range(2,x):
    #     k=2
    #     while x>=k*i:
    #         if x%(k*i)==0:
    #             return False
    #         k+=1
    # return True
for i in a:
    r=int(reverse(i))
    if isPrime(r)==True:
        print(r,end=' ')

