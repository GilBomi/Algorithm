from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n,m=map(int,input().split())
    dy=[[0]*(n+1) for _ in range(n+1)]
    degree=[0]*(n+1) # p->q일때 q로 도착하는게 몇개인지 degree[q]에 저장
    queue=deque()
    for _ in range(m):
        n1,m1=map(int,input().split())
        dy[n1][m1]=1
        degree[m1]+=1
    for i in range(1,n+1):
        if degree[i]==0:
            queue.append(i)
    while queue:
        x=queue.popleft()
        print(x, end=' ')
        for i in range(1,n+1):
            if dy[x][i]==1:
                degree[i]-=1
                if degree[i]==0:
                    queue.append(i)
    

