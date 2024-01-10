
import sys
sys.stdin=open("input.txt","rt")

a=list(input())
b=list(input())
d=dict()
for i in range(len(a)):
    if d.get(a[i])==None:
        d[a[i]]=1
    else:
        d[a[i]]+=1
    if d.get(b[i])==None:
        d[b[i]]=-1
    else:
        d[b[i]]-=1
for key,val in d.items():
    if val!=0:
        print("NO")
        break
else:
    print("YES")
