from collections import deque

def solution(sizes):
    width,height=0,0
    for arr in sizes:
        mmin=min(arr)
        mmax=max(arr)
        arr[0]=mmin
        arr[1]=mmax
        width=max(width,arr[0])
        height=max(height,arr[1])
    return width*height

if __name__=="__main__":
    print(solution([[60, 50], [30, 70], [60, 30], [80, 40]]))