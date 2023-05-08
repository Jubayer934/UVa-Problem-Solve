while True:
    try:
        x=int(input())
        y=int(input())
    except EOFError:
        break
    tem=1/x
    tem=pow(y,tem)
    print(round(tem))