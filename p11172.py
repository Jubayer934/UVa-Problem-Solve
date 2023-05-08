n=int(input())
    
while n>=1:
    n=n-1
    num1,num2=map(int,input().split())

    if num1>num2:
        print('>')
    elif num1<num2:
        print('<')
    else:
        print('=')