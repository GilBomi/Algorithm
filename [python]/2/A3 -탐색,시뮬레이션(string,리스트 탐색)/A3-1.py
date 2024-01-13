import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n=int(input())
    for i in range(1,n+1):
        s=input()
        s=s.upper()
        result='YES'
        for j in range(0,len(s)//2):
            if s[j]!=s[len(s)-1-j]:
                result='NO'
                break
        print('#%d %s' %(i,result))
