from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n,m=map(int,input().split())
    dy=[[5000]*(n+1) for _ in range(n+1)]
    for i in range(1,n+1): # 자기 자신으로 갈때
        dy[i][i]=0
    for i in range(m):
        a,b,c=map(int,input().split()) # 입력값으로 갈때
        dy[a][b]=c
    for k in range(1,n+1): # 플로이드-와샬 알고리즘
        for i in range(1,n+1):
            for j in range(1,n+1):
                # dy[k][j]=min(dy[k][j],dy[k][i]+dy[i][j]) # 다른 정답이 나옴(dy 배열 전체 값이 갱신되는 도중에 k 값이 바뀜)
                dy[i][j]=min(dy[i][j],dy[i][k]+dy[k][j]) # dy 배열 전체 값이 갱신된 다음 k 값이 바뀜
    for i in range(1,n+1): # 정답 출력
        for j in range(1,n+1):
            if dy[i][j]==5000:
                print('M',end=' ')
            else:
                print(dy[i][j],end=' ')
        print()
