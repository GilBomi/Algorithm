import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    previousScore=0 if li[0]==0 else 1
    score=previousScore
    for i in range(1,n):
        if li[i]==1:
            previousScore+=1
        else:
            previousScore=0
        score+=previousScore
    print(score)
