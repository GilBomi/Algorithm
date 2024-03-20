from collections import deque



if __name__=="__main__":
    e,s,m=map(int,input().split())
    x=1
    while True:
        if (x-e)%15==0 and (x-s)%28==0 and (x-m)%19==0:
            print(x)
            break
        x+=1