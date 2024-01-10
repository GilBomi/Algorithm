# import sys
# sys.stdin=open("input.txt","rt")

s=input()
a=list(s)
stack=[]
for x in a:
    if x.isdecimal()==False:
        a=stack.pop()
        b=stack.pop()
        if x=='*':
            stack.append(a*b)
        elif x=='/':
            stack.append(b/a)
        elif x=='+':
            stack.append(a+b)    
        else: # -
            stack.append(b-a)
    else:
        stack.append(int(x))
print(stack[0])