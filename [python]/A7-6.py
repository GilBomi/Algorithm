from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def dfs(s,e): # (시작 인덱스 값, 끝나는 인덱스값)
    global cnt
    if e>len(n):
        alpha=''
        print(d)
        # for x in d:
        #     if 0<int(x)<27:
        #         alpha+=chr(int(x)+64)
        #     else:
        #         return
        # print(alpha)
        return
    d.append(n[s:e])
    dfs(s+1,s+2) # 한자리 숫자
    d.pop()
    d.append(n[s:s+1])   
    dfs(s+1,s+3) # 두자리 숫자
    d.pop()

if __name__=="__main__":
    n=int(input())
    n=str(n)
    d=deque()
    li=list()
    cnt=0
    dfs(0,1)
    print(cnt)