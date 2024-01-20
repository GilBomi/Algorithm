import sys
# sys.stdin=open("input.txt","rt")

def distance(x):
    num=1
    previous=li[0]
    for i in range(1,len(li)):
        if previous+x>li[i]:
            continue
        elif previous+x<=li[i]:
            previous=li[i]
            num+=1
    return num
        

if __name__=="__main__":
    n,c=map(int,input().split())
    li=list()
    for _ in range(n):
        li.append(int(input()))
    li.sort()
    lt,rt=li[0],li[len(li)-1]
    res=0
    while lt<=rt:
        mid=(lt+rt)//2 # 가까운 두 말의 최대 거리
        d=distance(mid)
        if d<c: # 두 말사이의 거리가 너무 길어서 말 갯수가 너무 적음
            rt=mid-1
        else: # 두 말 사이의 거리가 너무 짧아서 말 갯수가 너무 많음
            lt=mid+1
            res=mid
    print(res)
    