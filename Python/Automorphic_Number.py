print("Automorphic Number Checker\n")
n = int(input("Enter the number : "))
if str(n*n)[len(str(n*n))-len(str(n)):] == str(n):
	print(f"{n} is an automorphic number.")
else:
	print(f"{n} is not an automorphic number.")