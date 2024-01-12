import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=list(map(int,input().split()))
    avg=int(sum(li)/n+0.5)
    num,score=0,0 # 학생 인덱스 번호, 점수
    min=float('inf') # 평균과 가까운 점수

    for i in range(n):
        li[i]-=avg
        if min>abs(li[i]):
            min=abs(li[i])
            score=li[i]
            num=i
        elif min==abs(li[i]):
            if score<li[i]:
                score=li[i]
                num=i
    print(avg,num+1,sep=' ')
