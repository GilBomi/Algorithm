from collections import deque
import sys
# sys.stdin=open("input.txt","rt")



if __name__=="__main__":
    s,e=map(int,input().split())
    ch=[0]*10001 # 깊이 저장
    d=deque()
    d.append(s)
    ch[s]=1
    while d:
        now=d.popleft()
        if now==e:
            break
        for x in (now-1,now+1,now+5):
            if 0<x<10001 and ch[x]==0: # ch에 이미 값이 저장되어있으면 깊이 값이므로 앞서서 저장된 값이 제일 적은값
                d.append(x)
                ch[x]=ch[now]+1
    print(ch[e]-1)