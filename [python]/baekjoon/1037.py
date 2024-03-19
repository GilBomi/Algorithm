from collections import deque


if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split(" ")))
    maxx=max(li)
    minn=min(li)
    print(maxx*minn)