import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,sum,totSum): # totSum: 더하든 말든 고려한 모든 변수들의 합
    global maxx
    if (total-totSum)+sum<maxx: # 아직 고려되지 않은 변수들의 총 합과 선택된 변수들의 합이 maxx보다 작을떄
        return
    if sum>c:
        return
    if x==n:
        if sum<=c and sum>maxx:
            maxx=sum
        return
    dfs(x+1,sum+li[x],totSum+li[x])
    dfs(x+1,sum,totSum+li[x])

if __name__=="__main__":
    c,n=map(int,input().split())
    li=[]
    for _ in range(n):
        li.append(int(input()))
    maxx=0
    total=sum(li)
    dfs(0,0,0)
    print(maxx)