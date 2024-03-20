from collections import deque



if __name__=="__main__":
    n,m=map(int,input().split())
    board=[]
    for _ in range(n):
        board.append(list(input()))
    minn=float('inf')
    t=[['W','B','W','B','W','B','W','B'],
       ['B','W','B','W','B','W','B','W'],
       ['W','B','W','B','W','B','W','B'],
       ['B','W','B','W','B','W','B','W'],
       ['W','B','W','B','W','B','W','B'],
       ['B','W','B','W','B','W','B','W'],
       ['W','B','W','B','W','B','W','B'],
       ['B','W','B','W','B','W','B','W']]
    for i in range(n-8+1):
        for j in range(m-8+1):
            whiteNum=0
            blackNum=0
            for y in range(8):
                for x in range(8):
                    if board[i+y][j+x]!=t[y][x]:
                        whiteNum+=1
                    else:
                        blackNum+=1
            minn=min(minn,blackNum,whiteNum)
    print(minn)
