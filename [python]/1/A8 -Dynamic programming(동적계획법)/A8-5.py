import sys
# sys.stdin=open("input.txt","rt")

if __name__=="__main__":
    n=int(input())
    a=list(map(int,input().split()))
    a.insert(0,0)
    dy=[0]*(n+1) # 여기에 최대 길이를 저장함
    dy[1]=1
    for i in range(1,n+1):
        mmax=0
        for j in range(1,i):
            if a[j]<a[i]:
                if mmax<dy[j]:
                    mmax=dy[j]
        if mmax==0:
            dy[i]=1    
        else:
            dy[i]=mmax+1
    print(max(dy))
