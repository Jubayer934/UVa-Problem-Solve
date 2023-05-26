r=1
while True:
    x = int(input())
    if x == 0:
        break	
    sum=0
    t=list(map(int,input().split()))[:x]
    for i in range(x):
        if t[i]>0:
            sum=sum+1
        else:
            sum=sum-1
    print("Case {}: {}".format(r,sum))
    r=r+1	
	