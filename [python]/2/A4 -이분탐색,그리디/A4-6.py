import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=list()
    for _ in range(n):
        height,weight=map(int,input().split())
        li.append((height,weight))
    li.sort()
    num=0
    for i in range(n):
        w1=li[i][1]
        for j in range(i+1,n):
            w2=li[j][1]
            if w1<w2:
                num+=1
                break
    print(n-num)