from collections import deque


def solution(n, times):
    answer = 0
    lt=0
    rt=max(times)*n
    while lt<=rt:
        mid=(lt+rt)//2 # 모두 심사 마친 최소 시간
        sum=0 # mid 시간 기준 심사할 수 있는 사람 수
        for i in times:
            sum+=mid//i
        if sum>=n:
            rt=mid-1
        else:
            lt=mid+1
    print(lt,rt,mid)
    return mid+1

if __name__=="__main__":
    print(solution(6,[7,10]))