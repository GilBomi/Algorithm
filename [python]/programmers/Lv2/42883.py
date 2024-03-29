from collections import deque
from itertools import permutations

def solution(number, k):
    answer = ''
    stack=list()
    for x in number:
        while stack and k>0 and stack[-1]<x:
            stack.pop()
            k-=1
        stack.append(x)
    if k!=0: # k가 남았을때
        stack=stack[:len(number)-k]
    return ''.join(stack)
        

if __name__=="__main__":
    print(solution("1924",2))
    print(solution("1231234",3))