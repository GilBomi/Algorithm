import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,sum1,sum2,sum3): # (깊이,각각의 합계)
    global mmin
    if x==n:
        if sum1!=sum2 and sum1!=sum3 and sum2!=sum3:
            if mmin>max(sum1,sum2,sum3)-min(sum1,sum2,sum3):
                mmin=max(sum1,sum2,sum3)-min(sum1,sum2,sum3)
        return
    dfs(x+1,sum1+li[x],sum2,sum3)
    dfs(x+1,sum1,sum2+li[x],sum3)
    dfs(x+1,sum1,sum2,sum3+li[x])

if __name__=="__main__":
    n=int(input())
    li=list()
    for _ in range(n):
        li.append(int(input()))
    mmin=float('inf')
    dfs(0,0,0,0)
    print(mmin)