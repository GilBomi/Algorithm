import sys
sys.stdin=open("input.txt","rt")
input=sys.stdin.readline



if __name__=="__main__":
    n,m=map(int,input().split())
    # a=[[0]*n]*n
    a=[[0]*n for i in range(n)]
    # a[1][3]=3
    # print(a)
    for i in range(m):
        q,w,d=map(int,input().split())
        a[q-1][w-1]=d
    for i in range(n):
        print(' '.join(map(str,a[i])))