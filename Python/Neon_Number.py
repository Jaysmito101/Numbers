print("Neon Number Checker\n")
n = int(input("Enter the number : "))
sq = n * n
s = 0
for digit in str(n) :
	s += int(digit)	
if s == n:
	print(f"{n} is a neon number.")
else:
	print(f"{n} is not a neon number.")