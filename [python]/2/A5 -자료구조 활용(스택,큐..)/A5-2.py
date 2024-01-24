import sys
# sys.stdin=open("input.txt","rt")


if __name__=="__main__":
    s=input()
    stack=list()
    num=0
    for i in range(len(s)):
        if len(stack)!=0:
            if s[i-1]=='(' and s[i]==')':
                stack.pop()
                num+=len(stack)
                continue
        if s[i]==')':
            num+=1
            stack.pop()
        else: # (
            stack.append(s[i])
    print(num)

