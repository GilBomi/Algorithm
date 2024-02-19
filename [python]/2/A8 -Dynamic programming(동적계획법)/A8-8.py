from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    # bfs로 풀면 타임 리밋남! 다이나믹으로 풀어야됨
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    dyn=[[0]*n for _ in range(n)]
    dyn[0][0]=li[0][0]
    for i in range(1,n):
        dyn[0][i]=dyn[0][i-1]+li[0][i]
        dyn[i][0]=dyn[i-1][0]+li[i][0]
    for i in range(1,n):
        for j in range(1,n):
            dyn[i][j]=min(dyn[i-1][j],dyn[i][j-1])+li[i][j]
    print(dyn[n-1][n-1])


    # bfs로 풀어서 다 통과됐으나 원래는 하면 타임 리밋남
    # d=deque()
    # d.append((0,0))
    # while d:
    #     now=d.popleft()
    #     x=now[0]
    #     y=now[1]
    #     for xx,yy in ((1,0),(0,1)):
    #         dx=x+xx
    #         dy=y+yy
    #         if 0<=dx<n and 0<=dy<n:
    #             if dyn[dx][dy]==0:
    #                 dyn[dx][dy]=dyn[x][y]+li[dx][dy]
    #                 d.append((dx,dy))
    #             else:
    #                 dyn[dx][dy]=min(dyn[dx][dy],dyn[x][y]+li[dx][dy])
    # print(dyn[n-1][n-1])
