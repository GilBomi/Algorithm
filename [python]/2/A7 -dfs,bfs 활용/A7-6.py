from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def dfs(x,p): # (시작 인덱스 값, ch 인덱스 값)
    global cnt
    if x==len(n)-1:
        # print(ch)
        for i in ch:
            if i!=0:
                print(i,end='')
        print()
        cnt+=1
        return
    for i in range(1,27): # 알파벳 돌면서
        if n[x]==i: # 한자리 숫자일떄
            ch[x]=chr(i+64)
            dfs(x+1,p+1)
            ch[x]=0
        elif i>=10 and i//10==n[x] and i%10==n[x+1]: # 두자리 숫자일때
            ch[x]=chr(i+64)
            dfs(x+2,p+1)
            ch[x]=0
        


if __name__=="__main__":
    n=int(input())
    n=list(map(int,str(n)))
    n.append(-1)
    cnt=0
    ch=[0]*len(n)
    dfs(0,0)
    print(cnt)