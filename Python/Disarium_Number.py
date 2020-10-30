print("Disarium Number Checker\n")
n = int(input("Enter the number : "))
s = 0
for index, digit in enumerate(str(n)) :
	s += int(digit) ** (index+1)
if s == n:
	print(f"{n} is a disarium number.")
else:
	print(f"{n} is not a disarium number.")