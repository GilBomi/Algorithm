import sys
# sys.stdin=open("input.txt","rt")

# 전위순회
def dfs(x):
    if x<8:
        print(x,end=' ')
        dfs(x*2)
        dfs(x*2+1)

if __name__=="__main__":
    dfs(1)