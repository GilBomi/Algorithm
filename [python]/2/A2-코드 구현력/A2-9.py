import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    max=0
    for i in range(n):
        ju=[0 for _ in range(7)] # 주사위 1~6
        money=0
        maxNum=0
        for j in range(3):
            ju[li[i][j]]+=1
            if maxNum<li[i][j]:
                 maxNum=li[i][j]
            if ju[li[i][j]]==3:
                money=10000+li[i][j]*1000
            elif ju[li[i][j]]==2:
                money=money=1000+li[i][j]*100
            if max<money:
                    max=money
        if money==0:
             money=maxNum*100
             if max<money:
                  max=money
    print(max)
            