from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


def dfs(x):
    if dy[x]!=0:
        return dy[x]
    if x==1:
        return dy[x]
    if x==2:
        return dy[x]
    dy[x]=dfs(x-1)+dfs(x-2)
    return dy[x] # 이 코드가 없으면 더 깊이가 깊은 코드를 위에서 읽어올 수가 없음

if __name__=="__main__":
    n=int(input())
    dy=[0]*(n+1) # 중복 체크
    dfs(n)
    print(dy[n])