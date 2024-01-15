import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,m=map(int,input().split())
    li=list(map(int,input().split()))
    count=0
    # 1번째 방법(time limit)
    # for i in range(n):
    #     sum=0
    #     for j in range(i,n):
    #         if sum+li[j]>m:
    #             break
    #         elif sum+li[j]==m:
    #             count+=1
    #             break
    #         else: # sum+li[j]<m
    #             sum+=li[j]
    # print(count)

    # 2번째 방법
    # 다시 풀기
    i,j=0,1
    sum=li[i]
    while i<n:
        if sum>m:
            sum-=li[i]
            i+=1
        elif sum==m:
            sum-=li[i]
            i+=1
            count+=1
        else: # sum<m
            if i==j:
                j+=1
            elif j==n:
                sum-=li[i]
                i+=1
            else:
                sum+=li[j]
                j+=1
    print(count)