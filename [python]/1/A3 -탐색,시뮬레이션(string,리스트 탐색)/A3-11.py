# import sys
# sys.stdin=open("input.txt","rt")

def round(a):
    for i in range(0,len(a)//2):
        if a[i]!=a[4-i]:
            return False
    else:
        return True

a=[list(map(int,input().split())) for _ in range(7)]
num=0
for i in range(7):
    for j in range(3):
        row=a[i][j:5+j]
        col=list()
        for k in range(5):
            col.append(a[j+k][i])
        if round(row):
            num+=1
        if round(col):
            num+=1
print(num)    

