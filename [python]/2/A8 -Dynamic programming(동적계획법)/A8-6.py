from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    li.insert(0,0)
    dy=[0]*(n+1) # 최대 선 갯수가 저장됨
    dy[1]=1
    # 이 방법은 비추. A8-5하고 똑같은 유형인데 
    # dy[i]에서 i값을 1,2,3같은 오름차순 값으로 하려고 하니까 더 복잡해짐
    # 그냥 dy[i]에서 i값을 오른쪽 번호(랜덤한 입력값 리스트)로 하면 훨씬 간단해짐
    for i in range(2,n+1): # i: 현재 번호
        mmax=0
        for j in range(1,n+1): # j: 현재 번호보다 작은 번호들
            if li[j]<i:
                if mmax<dy[li[j]]:
                    mmax=dy[li[j]]
            if li[j]==i:
                break
        if mmax==0:
            dy[i]=1
        else:
            dy[i]=mmax+1
    print(max(dy))

    