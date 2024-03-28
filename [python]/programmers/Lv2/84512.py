from collections import deque
from itertools import permutations

def solution(word):
    answer = 0
    depth=0
    def dfs(w):
        nonlocal answer,depth
        if len(w)>5:
            print('out:',w)
            return
        if w==word:
            answer=depth
            return 
        depth+=1
        dfs(w+'A')
        dfs(w+'E')
        dfs(w+'I')
        dfs(w+'O')
        dfs(w+'U')

    dfs('')
    return answer

if __name__=="__main__":
    print(solution("AAAE"))