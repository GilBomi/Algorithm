
from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    s,e=map(int,input().split())
    d=deque()
    ch=[0]*10001 # 중복 체크
    res=[0]*10001 # 레벨 저장
    d.append(s)
    ch[s]=1
    res[s]=0
    while True:
        now=d.popleft()
        if now==e:
            break
        for x in (now+1,now-1,now+5):
            if 0<x<=10000 and ch[x]==0:
                d.append(x)
                ch[x]=1
                res[x]=res[now]+1
    print(res[e])
        
        
