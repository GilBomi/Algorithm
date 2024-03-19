from collections import deque


def solution(s):
    answer = True
    queue=deque(list(s))
    bowl=deque()
    while queue:
        first=queue.popleft()
        if first=='(':
            bowl.append(first)
        else: # )
            if len(bowl)!=0 and bowl[0]=='(':
                bowl.pop()
            else:
                answer=False 
                break
    if len(bowl)!=0:
        answer=False
    return answer

if __name__=="__main__":
    print(solution(")()("))