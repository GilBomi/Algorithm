# import sys
# sys.stdin=open("input.txt","rt")

n,r=map(int,input().split())
r=int(r)
a=list(map(int,str(n)))
st=[]
j=0
i=0
while j<r:
    if i==len(a)-1:
        break
    if len(st)==0:
        st.append(a[i])
        i+=1
    elif st[-1]<a[i]:
        j+=1
        st.pop()
    else:
        st.append(a[i])
        i+=1
answer=st+a[i:]
if i==len(a)-1:
    print(''.join(map(str,answer[:-(r-j)])))
else:
    print(''.join(map(str,answer)))