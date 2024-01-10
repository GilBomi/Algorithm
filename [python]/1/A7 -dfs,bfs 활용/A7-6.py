import sys
# sys.stdin=open("input.txt","rt")

def dfs(L,P):
    global cnt
    if L==len(c)-1:
        cnt+=1
        for i in range(P):
            print(chr(res[i]+64),end='')
        print()
        return
    for i in range(1,27):
        if c[L]==i:
            res[P]=i
            # print('if:',L,P,res)
            dfs(L+1,P+1)
        elif i>=10 and c[L]==i//10 and c[L+1]==i%10:
            res[P]=i
            # print('elif:',L,P,res)
            dfs(L+2,P+1)


if __name__=="__main__":
    c=list(map(int,input()))
    cnt=0
    c.append(-1)
    res=[0]*len(c)
    dfs(0,0)
    print(cnt)

