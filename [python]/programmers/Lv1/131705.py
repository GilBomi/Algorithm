from collections import deque

def solution(number):
    answer = 0
    def dfs(n,index,sum): # (깊이,시작 인덱스,합계)
        nonlocal answer
        if n==3:
            if sum==0:
                answer+=1
            return
        for i in range(index,len(number)):
            dfs(n+1,i+1,sum+number[i])
    dfs(0,0,0)
    return answer

if __name__=="__main__":
    print(solution([-2, 3, 0, 2, -5]))