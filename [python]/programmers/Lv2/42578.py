from collections import deque
import heapq

def solution(clothes):
    answer = 1
    wear=dict()
    for name,kind in clothes:
        if wear.get(kind)==None:
            wear[kind]=[name]
        else:
            wear[kind]+=[name]
    for kind in wear.keys():
        answer*=(len(wear[kind])+1)
    return answer-1

if __name__=="__main__":
    print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))