from collections import deque


def isValid(self, s):
        answer=True
        queue=deque(list(s))
        d=deque()
        dict={'(':')','[':']','{':'}'}
        while queue:
            first=queue.popleft()
            if dict[first]:
                 d.append(dict[first])
            else:
                if len(d)!=0 and d[-1]==first:
                      d.pop()
                else:
                    answer=False
                    break
        if len(d)!=0:
            answer=False
        # print(answer)
        return answer

if __name__=="__main__":
    e,s,m=map(int,input().split())
    x=1
    while True:
        if (x-e)%15==0 and (x-s)%28==0 and (x-m)%19==0:
            print(x)
            break
        x+=1