# import sys
# sys.stdin=open("input.txt","rt")

s=input()
a=list(map(str,s))
stack=[]
cnt=0
for i in range(len(a)):
    if a[i]=='(':
        stack.append(a[i])
    elif a[i-1]=='(':
        stack.pop() 
        cnt+=len(stack)
    else: # a[i-1]==')'
        cnt+=1
        stack.pop()
print(cnt)