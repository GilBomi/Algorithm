import sys
# sys.stdin=open("input.txt","rt")

def dfs(L,a,b,c):
    global mmin
    if L==n:
        if a!=b and b!=c and a!=c:
            tmp=max(a,b,c)-min(a,b,c)
            if tmp<mmin: 
                mmin=tmp
        return
    dfs(L+1,a+m[L],b,c)
    dfs(L+1,a,b+m[L],c)
    dfs(L+1,a,b,c+m[L])

# 성공하거나 time limit 발생(그러나 질문을 보니 컴퓨터 문제였다...)
# def dfs(L):
#     global mmin,a1,b1,c1
#     if L==n:
#         if a1!=b1 and b1!=c1 and a1!=c1:
#             if max(a1,b1,c1)-min(a1,b1,c1)<mmin: 
#                 # print(a,b,c)   
#                 mmin=max(a1,b1,c1)-min(a1,b1,c1)
#         return
#     a1+=m[L]
#     dfs(L+1)
#     a1-=m[L]
#     b1+=m[L]
#     dfs(L+1)
#     b1-=m[L]
#     c1+=m[L]
#     dfs(L+1)
#     c1-=m[L]

if __name__=="__main__":
    n=int(input())
    m=[]
    for i in range(n):
        m.append(int(input()))
    mmin=float('inf')
    dfs(0,0,0,0)

    # a1,b1,c1=0,0,0
    # dfs(0)
    print(mmin)
