import sys
# sys.stdin=open("input.txt","rt")

def dfs(L,lt,rt):
    global cnt
    if L==k:
        if ch[abs(lt-rt)]==0 and abs(lt-rt)!=0:
            ch[abs(lt-rt)]=1
            cnt+=1
        return
    dfs(L+1,lt+a[L],rt)
    dfs(L+1,lt,rt+a[L])
    dfs(L+1,lt,rt)

if __name__=="__main__":
    k=int(input())
    a=list(map(int,input().split()))
    s=sum(a)
    ch=[0]*(s+1)
    cnt=0
    dfs(0,0,0)
    print(s-cnt)