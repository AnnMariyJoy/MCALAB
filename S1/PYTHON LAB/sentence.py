sent = raw_input("Enter sentence:")
pos = 0
neg = 0
strn=sent.split()
posList = ["good","nice","well done"]
negList = ["bad","cheat","wrong"]

for string in strn:
	if string in posList:
		pos += 1
	elif string in negList:
		neg += 1
		
print("positive:",pos)
print("Negative:",neg)

if pos>neg:
	print("This sentence is positive")
else:
	print("This sentence is negative")
