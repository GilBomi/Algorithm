# import sys
# sys.stdin=open("input.txt","rt")

a=[list(map(int,input().split())) for _ in range(9)]
flag='YES'
for i in range(9):
    s1=[0]*10 # 행
    s2=[0]*10 # 열
    for j in range(9):
        x=a[i][j]
        y=a[j][i]
        if s1[x]==0:
            s1[x]=1
        else:
            flag='NO'
            break
        if s2[y]==0:
            s2[y]=1
        else:
            flag='NO'
            break
for i in range(3):
    for j in range(3):
        s3=[0]*10
        for k in range(3):
            for s in range(3):
                s3[a[i*3+k][j*3+s]]=1
        if sum(s3)!=9:
            flag='NO'
print(flag)