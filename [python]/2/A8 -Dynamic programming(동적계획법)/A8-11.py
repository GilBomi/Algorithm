from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    m=int(input())
    dy=[0]*(m+1) # 거슬러 줄 동전의 최소개수를 저장해놓음
    for x in li:
        for i in range(x,m+1):
            if dy[i]!=0:
                dy[i]=min(dy[i],dy[i-x]+1)
            else:
                dy[i]=dy[i-x]+1
    print(dy[m])