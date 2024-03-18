from collections import deque


def solution(prices):
    answer = [0]*len(prices)
    for i in range(len(prices)):
        for j in range(i+1,len(prices)):
            if prices[j]>=prices[i]:
                print(i,j)
                answer[i]+=1
            else:
                answer[i]+=1
                break

    return answer

if __name__=="__main__":
    print(solution([1, 2, 3, 2, 3]))