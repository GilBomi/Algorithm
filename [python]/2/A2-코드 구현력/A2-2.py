import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    t=int(input())
    for i in range(t):
        n,s,e,k=map(int,input().split())
        li=list(map(int,input().split()))
        li=li[s-1:e]
        li.sort()
        print('#%d %d' %(i+1,li[k-1]))
    
        
            
    
    