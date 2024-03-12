from collections import deque


def solution(tickets):
    answer = []
    sorted_tickets = sorted(tickets, key=lambda x: (x[0], x[1]))
    visited=[0]*len(tickets) # 방문한 티켓 체크
    def dfs(n,current): # (현재까지 방문한 티켓수,현재 티켓)
        if n==len(tickets)-1:
            answer.append(current[1])
            print(answer)
            return True
        for index,value in enumerate(sorted_tickets):
            if current[1]==value[0]:
                if visited[index]==0:
                    visited[index]=1
                    answer.append(value[0])
                    if dfs(n+1,value):
                        return True
                    visited[index]=0
                    answer.pop()
        
    for index,value in enumerate(sorted_tickets):
        if value[0]=="ICN":
            visited[index]=1
            answer.append(value[0])
            if dfs(0,value):
                break
            visited[index]=0
            answer.pop()
    return answer

if __name__=="__main__":
    print(solution([["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]))