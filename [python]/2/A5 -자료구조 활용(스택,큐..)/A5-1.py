from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,m=map(int,input().split())
    li=list(map(int,str(n)))
    stack=list()
    for x in li:
        while stack and m>0 and stack[-1]<x:
            stack.pop()
            m-=1
        stack.append(x)
    if m!=0:
        stack=stack[:-m]
    print(''.join(map(str,stack)))

    