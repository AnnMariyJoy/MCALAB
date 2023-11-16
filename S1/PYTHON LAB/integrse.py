numbers=input("Enter a list of integers,separated by commas:")
#number=[int (x) for x in numbers . split(",")]
for number in numbers:
	if number > 100:
		print("over")
	else:
		print(number)
