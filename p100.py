rem = {}

def cycle(x):
	if x in rem:
		return rem[x]
	
	if x <= 1:
		return 1
	
	if x % 2 == 0:
		y = x//2
	else:
		y = 3*x+1
	
	rem[x] = cycle(y) + 1
	return rem[x]

while True:
	try:
		x, y = map(int, input().split())
	except EOFError:
		break

	tem1,tem2=x,y
	if x>y:
		x,y=y,x
	result = 0
	for i in range(x, y+ 1):
		n = cycle(i)
			
		if n > result:
			result = n
	
	print(tem1, tem2, result)