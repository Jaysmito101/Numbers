print("Sunny Number Checker\n")
n = int(input("Enter the number : "))
if (n+1) ** 0.5 == int((n+1) ** 0.5):
	print(f"{n} is an sunny number.")
else:
	print(f"{n} is not an sunny number.")