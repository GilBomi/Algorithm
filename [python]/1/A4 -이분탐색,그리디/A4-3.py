# import sys
# sys.stdin=open("input.txt","rt")

def count(mid):
    sum=0
    num=1
    for x in a:
        if sum+x>mid:
            sum=x
            num+=1            
        else:
            sum+=x
    return num
    
n,m=map(int,input().split())
a=list(map(int,input().split()))
lt=1
rt=sum(a) # dvd의 녹화 가능한 최대 용량
res=0
maxx=max(a)
while lt<=rt:
    mid=(lt+rt)//2 
    c=count(mid)
    if mid>=maxx and c<=m:
        res=mid
        rt=mid-1
    else:
        lt=mid+1
print(res)    
    

