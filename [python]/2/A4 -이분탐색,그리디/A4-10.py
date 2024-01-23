import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    arr=[0 for _ in range(n)]
    for i in range(n):
        num=0
        for j in range(n):
            if arr[j]==0 and num==li[i]:
                arr[j]=i+1
                break
            if arr[j]==0:
                num+=1
    print(' '.join(map(str,arr)))
            

