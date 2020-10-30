print("Deficient Number Checker\n")
n = int(input("Enter the number : "))
s = 0
for i in range(1, n//2+1) :
	if n%i == 0:
		s += i
if s < n:
	print(f"{n} is a deficient number.")
else:
	print(f"{n} is not a deficient number.")