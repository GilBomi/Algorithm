import sys
# sys.stdin=open("input.txt","rt")




if __name__=="__main__":
    n=int(input())
    li=list()
    for _ in range(n):
        start,end=map(int,input().split())
        li.append((start,end))
    li.sort(key=lambda x:(x[1],x[0]))
    num=1
    previous=li[0][1]
    for i in range(1,n):
        if previous<=li[i][0]:
            num+=1
            previous=li[i][1]
    print(num)