import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    li=[list(map(int,input().split())) for _ in range(9)]
    flag=True
    for i in range(9):
        w=[0 for _ in range(9)] # 가로 중복 체크
        h=[0 for _ in range(9)] # 세로 중복 체크

        for j in range(9):
            if w[li[i][j]-1]==1 or h[li[j][i]-1]==1:
                flag=False
            w[li[i][j]-1]=1
            h[li[j][i]-1]=1
    
    for i in range(3): # 0,1,2
        for j in range(3): # 0,1,2
            arr=[0 for _ in range(9)]
            for k in range(3):
                for s in range(3):
                    if arr[li[3*i+k][3*j+s]-1]==1:
                        flag=False
                    arr[li[3*i+k][3*j+s]-1]=1
    
    if flag:
        print("YES")
    else:
        print("NO")
