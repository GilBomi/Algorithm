import sys
# sys.stdin=open("input.txt","rt")

def digit_sum(x):
    li=list(str(x))
    sum=0
    for k in li:
        sum+=int(k)
    return sum

if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    maxSum=0
    maxNum=0
    for x in li:
        sum=digit_sum(x)
        if maxSum<sum:
            maxSum=sum
            maxNum=x
    print(maxNum)
