from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

def check(): # 토마토 상자에 익지 않은게 하나라도 존재하는지 체크
    for i in range(n):
        for j in range(n):
            if li[i][j]==0:
                return False # 익지 않은게 존재함

if __name__=="__main__":
    n,m=map(int,input().split())
    li=[list(map(int,input().split())) for _ in range(m)]
    if check()==False:
        print(0)
        sys.exit(0)
    d=deque()
    cnt=0 # 최소 날짜
    ch=[[0]*n for _ in range(n)] # 이미 간 부분인지 중복 체크(0: 아직 안가봄)
    while True:
        for i in range(n):
            for j in range(n):
                if li[i][j]==1:
                    d.append((i,j))
                    ch[i][j]=1
        length=len(d)
        for i in range(length):
            now=d.popleft()
            x=now[0]
            y=now[1]
            
    