# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
an=list(map(int,input().split()))
m=int(input())
am=list(map(int,input().split()))

i,j=0,0
s=list()
while True:
    if i>=n:
        s+=am[j:]
        break
    elif j>=m:
        s+=an[i:]
        break
    if an[i]<am[j]:
        s.append(an[i])
        i+=1
    elif an[i]==am[j]:
        s.append(an[i])
        s.append(am[j])
        i+=1
        j+=1
    else:
        s.append(am[j])
        j+=1
s=map(str,s)
print(' '.join(s))
