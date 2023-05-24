x=int(input())
while x>0:
    x=x-1
    p=int(input())
    p=p*567
    p=p/9
    p=p+7492
    p=p*235
    p=p/47
    p=p-498
    p=abs(p)
    p=p%100
    p=p/10
    print(int(p))