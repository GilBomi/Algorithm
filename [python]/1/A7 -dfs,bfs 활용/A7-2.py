import sys
# sys.stdin=open("input.txt","rt")

def dfs(t,p):
    global max
    if t>n:
        return
    if max<p:
        max=p 
    for i in range(t,n):
        dfs(i+a[i][0],p+a[i][1])

if __name__=="__main__":
    n=int(input())
    a=[]
    for i in range(n):
        t,p=map(int,input().split())
        a.append((t,p))
    max=0
    dfs(0,0)
    print(max)