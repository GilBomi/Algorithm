from collections import deque

def solution(n, edge):
    answer = 0
    arr=[[]*n for _ in range(n)]
    for node in edge:
        arr[node[0]-1].append(node[1]-1)
        arr[node[1]-1].append(node[0]-1)
    visited=[-1]*n
    d=deque()
    d.append(0)
    visited[0]=0
    while d:
        node=d.popleft()
        for i in arr[node]:
            if visited[i]==-1:
                visited[i]=visited[node]+1 
                d.append(i)
    maxx=max(visited)
    for i in visited:
        if i==maxx:
            answer+=1

    return answer

if __name__=="__main__":
    solution(6,[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]])