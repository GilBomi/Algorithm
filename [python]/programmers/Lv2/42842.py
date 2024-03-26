from collections import deque


def solution(brown, yellow):
    print(4**0.5)
    for i in range(1,yellow+1): # 가로길이
        if yellow%i==0:
            sum=(i+yellow//i)*2+4
            if sum==brown:
                return [yellow//i+2,i+2]

if __name__=="__main__":
    print(solution(10,2))
    print(solution(24,24))