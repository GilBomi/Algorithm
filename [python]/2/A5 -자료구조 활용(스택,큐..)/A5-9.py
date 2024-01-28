from collections import deque
import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    s1=input()
    s2=input()
    d=dict()
    for x in s1:
        if d.get(x)==None:
            d[x]=1
        else:
            d[x]+=1
    flag=True
    for x in s2:
        if d.get(x)==None:
            flag=False
            break
        else:
            d[x]-=1
    for key in d:
        if d[key]!=0:
            flag=False
    if flag==False:
        print('NO')
    else:
        print('YES')
    
            

    

