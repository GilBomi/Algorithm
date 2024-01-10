# import sys
# sys.stdin=open("input.txt","rt")

s=input()
a=list(s)
stack=[]
s=''
for x in a:
    if 47<ord(x)<58: # 숫자일때
        s+=x
    else: #연산자일때 or 괄호일때
        if len(stack)==0:
            stack.append(x)
        else:
            if x=='(':
                stack.append(x)
            elif x==')':
                for i in range(len(stack)-1,-1,-1):
                    if stack[i]=='(':
                        stack.pop()
                    else:
                        s+=stack.pop()
            elif x=='*' or x=='/':
                while stack:
                    if stack[-1]=='*' or stack[-1]=='/':
                        s+=stack.pop()
                    else:
                        break
                stack.append(x)
            elif x=='+' or x=='-':
                while stack:
                    if stack[-1]!='(':
                        s+=stack.pop()
                    else:
                        break
                stack.append(x)
if len(stack)!=0:
    for x in stack:
        s+=stack.pop()
print(s)