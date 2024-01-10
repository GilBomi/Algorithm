
from collections import deque
import sys
sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    a=[]
    for i in range(n):
        a.append(list(map(int,input().split())))
    d=deque()
    d.append((n//2,n//2))
    ch=[[0]*n for i in range(n)] # 중복 체크
    dep=[[0]*n for i in range(n)] # 깊이 저장
    ch[n//2][n//2]=1
    dep[n//2][n//2]=0
    cnt=a[n//2][n//2]

    while True:
        now=d.popleft() # (2,2)
        n1=now[0]
        n2=now[1]
        if dep[n1][n2]==n//2:
            break
        for next in ((n1-1,n2),(n1,n2-1),(n1+1,n2),(n1,n2+1)):
            if next[0]>=0 and next[1]>=0 and next[0]<n and next[1]<n:
                if ch[next[0]][next[1]]==0:
                    d.append(next)
                    cnt+=a[next[0]][next[1]]
                    ch[next[0]][next[1]]=1
                    dep[next[0]][next[1]]=dep[now[0]][now[1]]+1
    print(cnt)

        
        
