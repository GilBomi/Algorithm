
# import sys
# sys.stdin=open("input.txt","rt")

N=int(input())
std=list(map(int,input().split()))
avg=round(sum(std)/len(std))
arMax=float('inf')
print(avg,end=' ')
for i in std:
    if abs(avg-arMax)>abs(avg-i):
        arMax=i # 번호가 빠른 값이 저장됨
if std.count(arMax)!=1 or std.count(avg-(arMax-avg))!=1:
    a=avg-(arMax-avg)
    arMax2=max(a,arMax)
    if std.count(arMax2)!=1:
        print(std.index(arMax2)+1)
    else:
        print(std.index(arMax)+1)    

else:
    print(std.index(arMax)+1)
    