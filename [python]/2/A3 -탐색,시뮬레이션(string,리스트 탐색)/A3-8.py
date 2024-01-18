from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    m=int(input())
    ro=[list(map(int,input().split())) for _ in range(m)]

    for i in range(m):
        index=ro[i][0]-1
        direction=ro[i][1]
        num=ro[i][2]
        arr=[0 for _ in range(m)] 
        d=deque(li[index])
        if direction==0: # 왼쪽
            for j in range(num):
                first=d.popleft()
                d.append(first)
        else: # 오른쪽
            for j in range(num):
                last=d.pop()
                d.appendleft(last)
        li[index]=list(d)
    
    lt,rt=0,n
    sum=0
    for i in range(n):
        for j in range(lt,rt):
            sum+=li[i][j]
        if i<n//2:
            lt+=1
            rt-=1
        else:
            lt-=1
            rt+=1 
    print(sum)
        