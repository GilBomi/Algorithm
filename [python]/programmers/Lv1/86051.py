from collections import deque

def solution(numbers):
    li=[0]*10
    answer=0
    for x in numbers:
        li[x]=1
    for i in range(len(li)):
        if li[i]==0:
            answer+=i
    return answer

if __name__=="__main__":
    print(solution([1,2,3,4,6,7,8,0]))