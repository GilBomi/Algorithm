from collections import deque

def solution(name):
    answer = 0
    if all(x=='A' for x in name):
        return answer
    mini=len(name)-1
    print(ord('A'),ord('Z'))
    # 뒤에서 알파벳 바꾸는게 더 빠른 경우: (90-65)//2+65+1
    for i,x in enumerate(name):
        if ord(x)>78:
            answer+=90-ord(x)+1
        else:
            answer+=ord(x)-65
        
        # 오른쪽으로 갈건지 왼쪽으로 갈건지 판단하는 코드
        next=i+1
        while next<len(name) and name[next]=='A':
            next+=1
        mini=min(mini,(i*2)+len(name)-next)

    return answer+mini

if __name__=="__main__":
    solution("JEROEN")
    solution("JAN")