import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    li=[list(map(int,input().split())) for _ in range(n)]
    maxx,r1,r2=0,0,0
    for i in range(n):
        width=0
        height=0
        r1+=li[i][n-i-1]
        r2+=li[i][i]
        for j in range(n):
            width+=li[i][j]
            height+=li[j][i]
        if width<height:
            if maxx<height:
                maxx=height
        else:
            if maxx<width:
                maxx=width
    if max(r1,r2)>maxx:
        maxx=max(r1,r2)
    print(maxx)
    