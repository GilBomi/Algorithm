import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,sum): # (깊이,물 무게)
    if x==k:
        s.add(abs(sum))
        return
    dfs(x+1,sum+li[x]) # 물그릇 반대쪽에 추 놓기
    dfs(x+1,sum-li[x]) # 물그릇과 함께 추 놓기
    dfs(x+1,sum) # 어느곳에도 추 놓지 않기

if __name__=="__main__":
    k=int(input())
    li=list(map(int,input().split()))
    s=set()
    dfs(0,0)
    print(sum(li)-len(s)+1)    