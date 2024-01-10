import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    n,k=map(int,input().split())
    result=0
    for index,value in enumerate(range(1,n+1)):
        if n%value==0:
            result+=1
        if result==k:
            print(value)
            break
    else:
        print(-1)
        
            
    
    