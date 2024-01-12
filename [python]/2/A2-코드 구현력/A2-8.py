import sys
# sys.stdin=open("input.txt","rt")

def reverse(x): 
    s=''
    for i in range(len(x)-1,-1,-1):
        s+=x[i]
    s=int(s)
    return s

def isPrime(x):
    li=[0 for _ in range(x+1)] # 0:소수, 1:소수 아님
    for i in range(2,x+1):
        j=2
        while i*j<=x:
            if li[i*j]==0:
                li[i*j]=1
            j+=1
    if li[x]==0 and x!=1:
        return True
    return False


if __name__=="__main__":
    n=int(input())
    li=list(input().split())
    for i in li:
        r=reverse(i)
        if isPrime(r):
            print(r,end=' ')


