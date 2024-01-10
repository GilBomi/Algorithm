# import sys
# sys.stdin=open("input.txt","rt")

def dfs(n):
    if n>0:
        dfs(n//2)
        print(n%2,end='')
n=int(input())
dfs(n)
