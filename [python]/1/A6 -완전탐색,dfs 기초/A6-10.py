import sys
# sys.stdin=open("input.txt","rt")
input=sys.stdin.readline

# 내 방식대로 푼 풀이(성공)
# def dfs(i):
#     global cnt,pre
#     if i==m:
#         for j in range(0,n+1):
#             if ch[j]==1:
#                 print(j,end=' ')
#         print()
#         cnt+=1
#         return
#     for j in range(1,n+1):
#         if ch[j]==0 and pre<j:
#             ch[j]=1
#             pre=j
#             dfs(i+1)
#             ch[j]=0
#             pre=0

# 강의에서 알려주는 풀이
def dfs(L,S):
    global cnt
    if L==m:
        print(' '.join(map(str,res)))
        cnt+=1
        return
    for i in range(S,n+1):
        res[L]=i
        dfs(L+1,i+1)
    

if __name__=="__main__":
    n,m=map(int,input().split())
    cnt=0
    # pre=0
    # ch=[0]*(n+1) # 해당되는 경우의 수 체크
    # dfs(0)

    res=[0]*m
    dfs(0,1)

    print(cnt)
