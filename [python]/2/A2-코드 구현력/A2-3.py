import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,k=map(int,input().split())
    li=list(map(int,input().split()))
    s=set()
    for i in range(n):
        for j in range(i+1,n):
            for h in range(j+1,n):
                s.add(li[i]+li[j]+li[h])
    s=list(s)
    s.sort(reverse=True)
    print(s[k-1])