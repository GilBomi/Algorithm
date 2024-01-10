
# import sys
# sys.stdin=open("input.txt","rt")

T=int(input())
for i in range(T):
    N,s,e,k=map(int,input().split())
    li=map(int,input().split())
    li=list(li)
    li=li[s-1:e]
    li.sort()
    answer=li[k-1]
    print('#',i+1,' ',answer,sep='')


