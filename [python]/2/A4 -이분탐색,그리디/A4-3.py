import sys
# sys.stdin=open("input.txt","rt")

def dvd갯수(mid):
    num=1
    sum=0
    for x in li:
        if sum+x>mid:
            sum=x
            num+=1
        else:
            sum+=x
    return num


if __name__=="__main__":
    n,m=map(int,input().split())
    li=list(map(int,input().split()))
    lt,rt=1,sum(li)
    res=0
    while lt<=rt:
        mid=(lt+rt)//2 # mid: 최소 용량 크기
        if dvd갯수(mid)<=m: # 한편의 dvd길이가 너무 길때
            rt=mid-1
            res=mid
        else: # 한편의 dvd길이가 너무 짧을때
            lt=mid+1
    print(res)