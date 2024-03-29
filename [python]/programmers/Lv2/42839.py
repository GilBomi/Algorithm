from collections import deque
from itertools import permutations


def solution(numbers):
    answer = 0
    
    arr = []
    permu=set() # 가능한 모든 조합
    for n in numbers:
        arr.append(n)

    for i in range(1, len(arr)+1): # 1자리부터 len(arr)자리까지 반복
        li=list(permutations(arr,i)) # i 자릿수로 가능한 모든 조합이 list로 리턴됨
        for j in li:
            permu.add(int(''.join(j))) # j=[('1',), ('7',)] 
    permu=list(permu)
    print(permu)

    # prime number
    for num in list(permu):
        flag = True
        for i in range(2, int(num**0.5+1)):
            if not flag:
                break
            if num%i==0:
                flag=False
        if flag and num!=1 and num!=0:
            answer += 1
    return answer

if __name__=="__main__":
    print(solution("17"))