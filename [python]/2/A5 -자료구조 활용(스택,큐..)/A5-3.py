import sys
# sys.stdin=open("input.txt","rt")


# 1. 숫자는 그대로 출력한다.
# 2. 만약 스택이 비어있다면 연산자를 그냥 스택에 넣는다.
# 3. (스택의 top에 있는 연산자의 우선순위 < 현재 연산자의 우선순위) 이면 현재 연산자를 그냥 스택에 넣는다.
# 4. (스택의 top에 있는 연산자의 우선순위 >= 현재 연산자의 우선순위) 이면 2번 혹은 3번 상황이 될 때까지 pop 하여 출력하고 연산자를 스택에 넣는다.
# 5. 모든 수식을 다 사용했다면 스택이 빌 때까지 pop하여 출력한다.
# 6. 우선순위는 (더하기=빼기) < (곱하기=나누기)이다.
# 7. 여는 괄호는 스택에 그냥 추가한다.
# 8. 여는 괄호 다음에 오는 연산자는 그냥 스택에 추가한다.
# 9. 닫는 괄호는 여는 괄호가 나올 때까지 스택을 pop 하여 출력한다. 다 출력하고 난 뒤 괄호들은 버린다.

if __name__=="__main__":
    s=input()
    stack=[]
    result=''
    for x in s:
        if 48<=ord(x)<58: # 숫자이면
            result+=x
        else: # 숫자가 아니라면
            if x=='(':
                stack.append(x)
            elif x=='*' or x=='/':
                while stack and (stack[-1]=='*' or stack[-1]=='/'):
                    result+=stack.pop()
                stack.append(x)
            elif x=='+' or x=='-':
                while stack and stack[-1]!='(':
                    result+=stack.pop()
                stack.append(x)
            elif x==')':
                while stack and stack[-1]!='(':
                    result+=stack.pop()
                stack.pop()
    while stack:
        result+=stack.pop()
    print(result)



    