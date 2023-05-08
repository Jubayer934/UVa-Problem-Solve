n=int(input())
while n>=1:
    n=n-1
    r,c=map(int,input().split())
    result=(r//3)*(c//3)

    print(result)
