print("Armstrong Number Checker\n")
n = int(input("Enter the number : "))
s = 0
for digit in str(n) :
	s += int(digit) ** 3
if s == n:
	print(f"{n} is an armstrong number.")
else:
	print(f"{n} is not an armstrong number.")