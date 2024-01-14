import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    m=int(input())
    li2=list(map(int,input().split()))
    i,j,index=0,0,0
    result=[0 for _ in range(n+m)]

    while i<n or j<m:
        if i>=n:
            result[index]=li2[j]
            j+=1
        elif j>=m:
            result[index]=li[i]
            i+=1
        else: # i<n and j<n
            if li[i]<li2[j]:
                result[index]=li[i]
                i+=1
            else:
                result[index]=li2[j]
                j+=1
        index+=1

    for x in result:
        print(x,end=' ')
            
