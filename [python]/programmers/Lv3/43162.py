from collections import deque


def solution(n, computers):
    answer = 0
    check=[0]*n # 갔던 길인지 체크
    d=deque()
    for y in range(n):
        if check[y]==0:
            answer+=1
            d.append(y)
            check[y]=1
        while d:
            dy=d.popleft()
            for dx in range(n):
                if check[dx]==0 and computers[dy][dx]==1 and dx!=dy:
                    check[dx]=1
                    d.append(dx)
                    print(dy,dx)
    return answer

if __name__=="__main__":
    print(solution(3,[[1, 1, 0], [1, 1, 1], [0, 1, 1]]))