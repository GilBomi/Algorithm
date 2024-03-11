from collections import deque


def solution(maps):
    answer = 0
    check=[[-1]*len(maps[0]) for _ in range(len(maps))]
    check[0][0]=1
    d=deque()
    d.append((0,0))
    while d:
        a=d.popleft()
        y,x=a[0],a[1]
        if x==len(maps[0])-1 and y==len(maps)-1:
            break
        for xx,yy in ((x+1,y),(x-1,y),(x,y+1),(x,y-1)):
            if 0<=xx<len(maps[0]) and 0<=yy<len(maps):
                if check[yy][xx]==-1 and maps[yy][xx]==1:
                    check[yy][xx]=check[y][x]+1
                    d.append((yy,xx))
    print(check)
    return check[len(maps)-1][len(maps[0])-1]

if __name__=="__main__":
    print(solution([[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]))