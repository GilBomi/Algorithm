from collections import deque

def solution(s):
    answer = ''
    alpha=['zero','one','two','three','four','five','six','seven','eight','nine']
    i=0
    while i<len(s):
        print(i)
        if s[i].isdecimal(): # 숫자일떄
            answer+=s[i]
            i+=1
        else: # 숫자가 아닐때
            word=s[i:i+3]
            for j in range(len(alpha)):
                if word in alpha[j]:
                    answer+=str(j)
                    i+=len(alpha[j])
    return answer

if __name__=="__main__":
    print(solution("one4seveneight"))