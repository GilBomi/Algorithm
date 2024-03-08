from collections import deque

def solution(price, money, count):
    answer=price*count*(count+1)/2-money
    if answer<0:
        answer=0
    return int(answer)

if __name__=="__main__":
    print(solution(3,20,4))