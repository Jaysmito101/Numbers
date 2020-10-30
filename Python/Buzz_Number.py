print("Buzz Number Checker\n")
n = int(input("Enter the number : "))
if n % 7 == 0 or str(n)[-1]=='7':
	print(f"{n} is a buzz number.")
else:
	print(f"{n} is not a buzz number.")