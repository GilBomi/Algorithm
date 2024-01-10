import sys
# sys.stdin=open("input.txt","rt")
input=sys.stdin.readline

# 강의보기전에 풀어본 풀이(통과함)
# def dfs(x,nn): # nn: 현재 동전의 갯수
#     global mmin
#     if nn>mmin:
#         return
#     if x<0:
#         return
#     if x==0:
#         if nn<mmin:
#             mmin=nn
#         return
#     for xx in a:
#         dfs(x-xx,nn+1)

# 강의에서 알려주는 개념으로 풀어본 풀이
def dfs(i,res):
    global mmin
    if mmin<i:
        return
    if res>m:
        return
    if res==m:
        if mmin>i:
            mmin=i
        return
    for xx in a:
        dfs(i+1,res+xx)


if __name__=="__main__":
    n=int(input())
    a=list(map(int,input().split()))
    m=int(input())
    a.sort(reverse=True)
    mmin=float('inf')
    # dfs(m,0)
    dfs(0,0)
    print(mmin)



