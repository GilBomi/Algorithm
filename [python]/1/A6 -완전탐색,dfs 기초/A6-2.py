# import sys
# sys.stdin=open("input.txt","rt")

def dfs(x):
    if x>7:
        return
    dfs(x*2)
    print(x,end=' ')
    dfs(x*2+1)

dfs(1)