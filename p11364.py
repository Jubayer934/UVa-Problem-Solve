n=int(input())

while n>=1:
    n=n-1

    len=int(input())
    a=list(map(int,input().split()))[:len]
    a.sort()
    max=a[-1]
    min=a[0]
    print((max-min)*2)