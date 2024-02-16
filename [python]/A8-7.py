from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    li.sort(key=lambda x:(x[0],x[1],x[2]),reverse=True) # 밑면 기준으로 역정렬
    print(li)
    dy=[0]*(n) # 최대 높이(답) 저장
    dy[0]=li[0][1]
    for i in range(0,n): # 위에 쌓을 벽돌
        mmax=0
        for j in range(0,i): # 이미 아래에 쌓인 벽돌
            if li[i][2]<li[j][2]:
                if mmax<dy[j]:
                    mmax=dy[j]
        if mmax==0:
            dy[i]=li[i][1]
        else:
            dy[i]=mmax+li[i][1]
    print(dy)
    print(max(dy))

