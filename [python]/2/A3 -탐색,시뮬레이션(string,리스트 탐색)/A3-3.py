import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    li=[i for i in range(21)]
    for _ in range(10):
        a,b=map(int,input().split())
        for i in range(a,(a+b)//2+1):
            n=li[i]
            li[i]=li[a+b-i]
            li[a+b-i]=n
    for i in range(1,21):
        print(li[i],end=' ')
