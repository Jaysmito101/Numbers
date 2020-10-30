print("Harshad Number Checker\n")
n = int(input("Enter the number : "))
s = 0
for digit in str(n) :
	s += int(digit)
if n % s == 0 :
	print(f"{n} is a harshad number.")
else :
	print(f"{n} is not a harshad number.")