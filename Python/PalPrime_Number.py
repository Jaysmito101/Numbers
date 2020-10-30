print("PalPrime Number Checker\n")
n = int(input("Enter the number : "))
flag = True
for i in range(2, n//2 +1):
	if n % i == 0:
		flag = False
		break
if str(n) == str(n)[::-1] and flag and n!=1:
	print(f"{n} is a palprime number.")
else:
	print(f"{n} is not a palprime number.")