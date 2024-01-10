from collections import deque
# import sys
# sys.stdin=open("input.txt","rt")

n,m=map(int,input().split())
d=deque(list(map(int,input().split())))

cnt=0
while m!=-1:
    nn=d.popleft()
    m-=1
    flag=False
    for i in range(len(d)):
        if nn<d[i]:
            flag=True
            break
    if flag: # 하나라도 큰 값이 있으면
        if m==-1:
            m=len(d)
        d.append(nn)
    else: # 큰 값이 없으면
        cnt+=1
print(cnt)
        
    
