import sys
# sys.stdin=open("input.txt","rt")

def 회전문(s):
    flag=True
    for k in range(len(s)//2):
        if s[k]!=s[len(s)-k-1]:
            flag=False
    return flag


if __name__=="__main__":
    li=[list(map(int,input().split())) for _ in range(7)]
    num=0
    for i in range(7):
        for j in range(7):
            if 0<=j<3:
                s=li[i][j:j+5]
                if 회전문(s)==True:
                    num+=1
            if 0<=i<3:
                s=''
                for k in range(5):
                    s+=str(li[i+k][j])
                if 회전문(s)==True:
                    num+=1
    print(num)
                
