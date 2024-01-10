# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
a=list(map(int,input().split()))

cnt=0
s=''
lt=0
rt=n-1
pre=0
while lt<=rt:
    if max(a[lt],a[rt])<pre:
        break
    elif min(a[lt],a[rt])>pre:
        if min(a[lt],a[rt])==a[lt]:
            pre=a[lt]
            s+='L'
            lt+=1
            cnt+=1
        else:
            pre=a[rt]
            s+='R'
            rt-=1
            cnt+=1
    elif max(a[lt],a[rt])>pre:
        if max(a[lt],a[rt])==a[lt]:
            pre=a[lt]
            s+='L'
            lt+=1
            cnt+=1
        else:
            pre=a[rt]
            s+='R'
            rt-=1
            cnt+=1

print(cnt)
print(s)
