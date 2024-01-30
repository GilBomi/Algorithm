import sys
# sys.stdin=open("input.txt","rt")

# 비추 방법: 매개변수에 늘어나는 문자열 변수가 들어감
# def dfs(depth,x): # dept: 트리 깊이
#     global total
#     if depth==m:
#         print(x)
#         total+=1
#         return
#     for i in range(1,n+1):
#         dfs(depth+1,x+str(i)+' ')

# 추천 방법: 따로 cnt 배열을 만들고 그 배열을 이용
def dfs(x): # x: 트리 깊이
    global total
    if x==m:
        for ii in cnt:
            print(ii,end=' ')
        print()
        total+=1
        return
    for i in range(1,n+1):
        cnt[x]=i
        dfs(x+1)


if __name__=="__main__":
    n,m=map(int,input().split())
    total=0
    cnt=[0]*m
    dfs(0)
    print(total)