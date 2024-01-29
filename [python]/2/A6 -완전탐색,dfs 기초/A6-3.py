import sys
# sys.stdin=open("input.txt","rt")


def dfs(x,s):
    if x<=n:
        dfs(x+1,s+str(x)+' ')
        dfs(x+1,s)
    else:
        print(s)

if __name__=="__main__":
    n=int(input())
    dfs(1,'')