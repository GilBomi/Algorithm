import sys
# sys.stdin=open("input.txt","rt")


def dfs(s,sum): # (시작일=index, 금액 합)
    global maxx
    if s>n:
        return
    if s==n:
        if sum>maxx:
            maxx=sum
        return
    dfs(s+li[s][0],sum+li[s][1]) # 해당 인덱스 예약을 잡을때
    dfs(s+1,sum) # 해당 인덱스 예약을 잡지 않을때


if __name__=="__main__":
    n=int(input())
    li=list()
    for i in range(n):
        t,p=map(int,input().split())
        li.append((t,p))
    maxx=0
    dfs(0,0)
    print(maxx)