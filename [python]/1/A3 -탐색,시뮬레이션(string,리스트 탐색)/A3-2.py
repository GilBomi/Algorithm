# import sys
# sys.stdin=open("input.txt","rt")

s=input()
n=''
for x in s:
    if 48<=ord(x)<=57:
        n+=x
n=int(n)
print(n)
def divisor_num(n):
    num=0
    for i in range(1,n+1):
        if n%i==0:
            num+=1
    return num
print(divisor_num(n))
