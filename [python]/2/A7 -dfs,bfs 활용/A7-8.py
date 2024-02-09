from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

# def dfs(x,p): # (시작 인덱스 값, ch 인덱스 값)
    
        


if __name__=="__main__":
    n=int(input())
    li=list()
    for _ in range(n):
        li.append(list(map(int,input().split())))
    d=deque()
    d.append((n//2,n//2))
    ch=[[-1]*n for _ in range(n)] # 중복 체크. -1이면 안간 길. 계속 더하면서 깊이 저장
    ch[n//2][n//2]=0
    sum=li[n//2][n//2]
    while d:
        now=d.popleft()
        w=now[0] # 행
        h=now[1] # 열
        if ch[w][h]==n//2: # 깊이가 n//2일때
            break
        for ww,hh in ((w+1,h),(w-1,h),(w,h+1),(w,h-1)):
            if ch[ww][hh]==-1:
                ch[ww][hh]=ch[w][h]+1
                d.append((ww,hh))
                sum+=li[ww][hh]
    print(sum)
        
                


