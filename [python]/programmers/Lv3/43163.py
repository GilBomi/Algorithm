from collections import deque


def different_one_char(word1,word2):
    cnt=0
    for i in range(len(word1)):
        if word1[i]==word2[i]:
            cnt+=1
    return len(word1)-cnt==1
 

def solution(begin, target, words):
    answer = 0
    check=[0]*len(words) # 방문한 워드인지
    d=deque()
    if begin in words:
        i=words.index(begin)
        check[i]=1
        d.append(i)
    else:
        words.append(begin)
        check.append(1)
        d.append(len(words)-1)
    while d:
        current=d.popleft()
        if words[current]==target:
            answer=check[current]-1
            break
        for i in range(len(words)):
            if check[i]==0:
                if different_one_char(words[current],words[i]):
                    check[i]=check[current]+1
                    d.append(i)
    print(check)
    return answer

if __name__=="__main__":
    print(solution("hit","cog",["hot", "dot", "dog", "lot", "log", "cog"]))