from collections import deque
from itertools import permutations

def solution(k, dungeons):
    maxx = -1
    visited=[0]*len(dungeons)
    def dfs(energy,answer): # (현재 에너지, 시행한 횟수)
        nonlocal maxx
        for i,v in enumerate(dungeons):
            if visited[i]==0 and v[0]<=energy: # 아직 방문 안했을때
                visited[i]=1
                dfs(energy-v[1],answer+1)
                visited[i]=0
        maxx=max(maxx,answer)
        return
    dfs(k,0)
    return maxx

if __name__=="__main__":
    print(solution(80,[[80,20],[50,40],[30,10]]))