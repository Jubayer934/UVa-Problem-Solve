while True:
    try:
        x=int(input())
    except EOFError:
        break
    ones=0
    a=0
    while True:
        a=(a*10+1)%x
        ones+=1
        if a==0:
            break
    print(ones)
