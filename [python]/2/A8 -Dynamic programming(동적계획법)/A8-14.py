from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    dy=[[100]*(n+1) for _ in range(n+1)]
    for i in range(1,n+1):
        dy[i][i]=0
    while True:
        p1,p2=map(int,input().split())
        if p1==-1 and p2==-1:
            break
        dy[p1][p2]=1
        dy[p2][p1]=1
    for k in range(1,n+1): # 플로이드-와샬 알고리즘
        for i in range(1,n+1):
            for j in range(1,n+1):
                dy[i][j]=min(dy[i][j],dy[i][k]+dy[k][j]) # dy 배열 전체 값이 갱신된 다음 k 값이 바뀜
    res=[0]*(n+1)
    minn=float('inf')
    for i in range(1,n+1):
        for j in range(1,n+1):
            res[i]=max(res[i],dy[i][j])
        minn=min(minn,res[i])
    ans=[]
    for i in range(1,n+1):
        if res[i]==minn:
            ans.append(i)
    print('%d %d' %(minn,len(ans)))
    for x in ans:
        print(x,end=' ')

