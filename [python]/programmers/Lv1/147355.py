from collections import deque

def solution(t, p):
    answer = 0
    li=list(t)
    for i in range(len(t)-len(p)+1):
        num=''
        for j in range(len(p)):
            num+=t[i+j]
        if int(num)<=int(p):
            answer+=1
    return answer

if __name__=="__main__":
    print(solution("3141592","271"))