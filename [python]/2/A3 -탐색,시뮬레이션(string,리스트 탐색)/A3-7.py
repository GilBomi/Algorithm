import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    sum=0
    middle=n//2 # 2
    for i in range(middle+1): # 0,1,2
        lt,rt=i,n-i
        for j in range(lt,rt):
            if i==0: # 정중앙일때
                sum+=li[middle-i][j]
            else:
                sum+=li[middle-i][j]
                sum+=li[middle+i][j]
    print(sum)


