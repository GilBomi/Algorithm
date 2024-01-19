import sys
# sys.stdin=open("input.txt","rt")

def cut(li,length):
    num=0
    for x in li:
        num+=x//length
    return num

if __name__=="__main__":
    k,n=map(int,input().split())
    li=[]
    for _ in range(k):
        li.append(int(input()))
    li.sort()
    maxx=li[len(li)-1]
    lt,rt=1,maxx
    res=0
    while lt<=rt:
        mid=(lt+rt)//2
        num=cut(li,mid)
        if num>=n: # 나누면 너무 많은 랜선이 생길때
            res=mid
            lt=mid+1
        elif num<n: # 나누면 너무 적은 랜선이 생길때
            rt=mid-1
    print(res)