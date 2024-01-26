from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    d=dict()
    for _ in range(n): 
        d[input()]=1
    for _ in range(n-1):
        s=input()
        if d.get(s)!='None':
            d[s]=2
    for key in d:
        if d[key]==1:
            print(key)
            break   