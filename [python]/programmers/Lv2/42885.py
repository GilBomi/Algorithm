from collections import deque
from itertools import permutations

def solution(people, limit):
    answer = 0
    people.sort()
    i,j=0,len(people)-1
    while True:
        if i>j:
            break
        elif i==j:
            answer+=1
            break
        if people[i]+people[j]<=limit:
            answer+=1
            i+=1
            j-=1
        else:
            answer+=1
            j-=1
    return answer

if __name__=="__main__":
    print(solution([70, 50, 80, 50],100))