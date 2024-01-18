import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    num=0
    for i in range(n):
        for j in range(n):
            up=i-1
            down=i+1
            left=j-1
            right=j+1
            flag=True
            if up>=0:
                if li[up][j]>=li[i][j]:
                    flag=False         
            if down<n:
                if li[down][j]>=li[i][j]:
                    flag=False   
            if left>=0:
                if li[i][left]>=li[i][j]:
                    flag=False
            if right<n:
                if li[i][right]>=li[i][j]:
                    flag=False
            if flag:
                num+=1

    print(num)



