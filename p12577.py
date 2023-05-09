count=0
while (1):
	try:
		line= input()
	except EOFError:
		break 
	count=count+1     
	if line[0]=='*':
		break
	elif line[0]=='H':
		print("Case ",count,': Hajj-e-Akbar')
	else:
		print('Case '+count+': Hajj-e-Asghar')