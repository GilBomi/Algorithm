import sys
sys.stdin=open("input.txt","rt")

n,m=map(int,input().split())
a=list(map(int,input().split()))

# 몸무게의 합이 140(m)에 가장 가까우도록

a.sort()
num=0
while a:
    if len(a)==1:
        num+=1
        break
    if a[0]+a[-1]>m:
        num+=1
        a.pop()
    else:
        num+=1
        a.pop(0)
        a.pop()
print(num)


    
                
        


