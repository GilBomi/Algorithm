import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    s=''
    i,j=0,n-1
    previous=0
    while True:
        if i==j:
            if previous<li[i]:
                s+='L'
            break
        else:
            if previous<li[i] and previous<li[j]:
                if li[i]<li[j]:
                    previous=li[i]
                    i+=1
                    s+='L'
                else:
                    previous=li[j]
                    j-=1
                    s+='R'
            elif previous<li[i] and previous>li[j]:
                previous=li[i]
                i+=1
                s+='L'
            elif previous>li[i] and previous<li[j]:
                previous=li[j]
                j-=1
                s+='R'
            else: # previous>li[i],li[j]
                break
    print(len(s))
    print(s)
