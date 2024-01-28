
# sys.stdin=open("input.txt","rt")


import heapq


if __name__=="__main__":
    h=[]
    while True:
        n=int(input())
        if n==0:
            print(heapq.heappop(h))
        elif n==-1:
            break
        else:
            heapq.heappush(h,n)

