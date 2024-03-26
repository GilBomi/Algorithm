from collections import deque


def solution(citations):
    answer = 0
    citations.sort(reverse=True)
    flag=True
    for h in range(len(citations),-1,-1):
        for j in range(h):
            if citations[j]<h:
                flag=False
                break
            flag=True
        if flag:
            return h

    return answer

if __name__=="__main__":
    print(solution([3, 0, 6, 1, 5]))