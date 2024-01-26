from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,m=map(int,input().split())
    li=list(map(int,input().split()))
    d=deque(li)
    result=0 # 정답
    while True:
        maxx=0
        for i in range(1,len(d)):
            if maxx<d[i]:
                maxx=d[i]
        if d[0]>=maxx:
            result+=1
            d.popleft()
            if m==0:
                break
            m-=1
        else: # 대기목록에 위험도가 높은 환자가 있을때
            d.append(d.popleft())
            if m==0:
                m=len(d)-1
            else:
                m-=1
    print(result)