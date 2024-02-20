from collections import deque
import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n,m=map(int,input().split())
    dy=[0]*(m+1) # 가방에 index 무게일때 보석의 최대 가치가 저장됨(정답)
    for i in range(n):
        w,v=map(int,input().split())
        for j in range(w,m+1):
            # dy[j-w]: j 무게에서 보석 무게 w를 뺐을때의 최대 가치값
            dy[j]=max(dy[j],dy[j-w]+v) 
    print(dy[m])