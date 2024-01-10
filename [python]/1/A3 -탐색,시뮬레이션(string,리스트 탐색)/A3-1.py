# import sys
# sys.stdin=open("input.txt","rt")

n=int(input())
for i in range(n):
    s=input()
    flag='YES'
    for x in range(len(s)//2):
        if ord(s[x])<=90:
            if ord(s[x])!=ord(s[len(s)-1-x]) and ord(s[x])+32!=ord(s[len(s)-1-x]):
                flag='NO'
                break
        else:
            if ord(s[x])!=ord(s[len(s)-1-x]) and ord(s[x])-32!=ord(s[len(s)-1-x]):
                flag='NO'
                break
    print('#%d %s' %(i+1,flag))
