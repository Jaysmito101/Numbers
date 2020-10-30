print("Adams Number Checker\n")
n = int(input("Enter the number : "))
if ( int( ( str(n*n)  )[::-1] ) ) ** 0.5 == int( ( str(n) )[::-1] ) :
	print(f"{n} is an adams number.")
else:
	print(f"{n} is not an adams number.")