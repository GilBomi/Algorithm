import sys
# sys.stdin=open("input.txt","rt")

def makeNumber(x):
    n=''
    for i in range(len(x)):
        if 48<=ord(x[i])<58:
            n+=x[i]
    return int(n)

def measure(n):
    li=[0 for _ in range(n+1)] # 1: 약수, 0: 약수 아님
    count=0
    for i in range(1,len(li)//2+1):
        if n%i==0:
            if li[i]==0:
                li[i]=1
                count+=1
            if li[n//i]==0:
                li[n//i]=1
                count+=1
    return count



if __name__=="__main__":
    s=input()
    n=makeNumber(s)
    print(n)
    count=measure(n)
    print(count)

