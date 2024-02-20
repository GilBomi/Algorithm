from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n,m=map(int,input().split())
    dy=[0]*(m+1) # 제한 시간(인덱스)안에 얻을 수 있는 최대 점수
    for _ in range(n):
        s,t=map(int,input().split())
        for i in range(m,t-1,-1):
            dy[i]=max(dy[i],dy[i-t]+s)
    # print(dy)
    print(dy[m])