def SumofSquares(n):
	s=0
	for i in range(n+1):
		s+=i**2
	return s
n=int(input("Enter n:"))
print("Sum of squares of first {} natural numbers:".format(n),SumofSquares(n))
	

