from collections import deque
from itertools import permutations

def solution(n, wires):
    answer = float('inf')
    arr=[[0]*(n+1) for _ in range(n+1)]
    for x in wires:
        arr[x[0]][x[1]]=1
        arr[x[1]][x[0]]=1
    for i in range(1,n+1):
        for j in range(1,n+1):
            visited=[0]*(n+1)
            d=deque()
            sum=1
            if arr[i][j]==1:
                arr[i][j]=0
                visited[1]=1
                d.append(1)
                while d:
                    node=d.popleft()
                    for p in range(1,n+1):
                        if arr[node][p]==1 and visited[p]==0: # 아직 방문 안했다면
                            visited[p]=1
                            d.append(p)
                            sum+=1
                arr[i][j]=1
                answer=min(answer,abs(2*sum-n))
    return answer

if __name__=="__main__":
    print(solution(9,[[1,3],[2,3],[3,4],[4,5],[4,6],[4,7],[7,8],[7,9]]))