from collections import deque
import heapq

def solution(priorities, location):
    answer = 1
    index=location
    queue=deque(priorities)
    while True:
        first=queue.popleft()
        flag=False
        for x in queue:
            if first<x:
                flag=True # 큰 값이 존재함
                break
        if flag: # True
            queue.append(first)
            index-=1
            if index<0:
                index=len(queue)-1
        else: # False
            if index==0:
                return answer
            answer+=1
            index-=1
            if index<0:
                index=len(queue)-1
    return answer


if __name__=="__main__":
    print(solution([1, 1, 9, 1, 1, 1],0))