from collections import deque


def solution(numbers, target):
    answer = 0
    def dfs(n,sum): # (깊이,합계)
        nonlocal answer
        if n==len(numbers):
            if sum==target:
                answer+=1    
            return
        dfs(n+1,sum+numbers[n])
        dfs(n+1,sum-numbers[n])
    dfs(0,0)
    return answer

if __name__=="__main__":
    print(solution([4, 1, 2, 1],4))