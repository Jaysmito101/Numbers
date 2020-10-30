print("Special Number Checker\n")
n = int(input("Enter the number : "))
s = 0
p = 1
for digit in str(n) :
	s += int(digit)
	p *= int(digit)
if p + s == n :
	print(f"{n} is a special number.")
else :
	print(f"{n} is not a special number.")