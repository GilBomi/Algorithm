import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,m=map(int,input().split())
    li=[[0]*n for _ in range(n)]
    for i in range(m):
        a,b,w=map(int,input().split())
        li[a-1][b-1]=w
    print(li)