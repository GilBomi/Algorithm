import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    L=int(input())
    li=list(map(int,input().split()))
    m=int(input())
    for i in range(m):
        li.sort()
        li[0]+=1
        li[L-1]-=1
    li.sort()
    print(li[L-1]-li[0])