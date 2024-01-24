import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    s=input()
    stack=[]
    for x in s:
        if x.isdecimal(): # 숫자라면
            stack.append(x)
        else: # 연산자라면
            after=int(stack.pop())
            before=int(stack.pop())
            if x=='*':
                stack.append(before*after)
            elif x=='/':
                stack.append(before/after)
            elif x=='+':
                stack.append(before+after)
            else: # x=='-'
                stack.append(before-after)
    print(stack.pop())