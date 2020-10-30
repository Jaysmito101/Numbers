print("Mersenne Number Checker\n")
n = int(input("Enter the number : "))
flag = False
for i in range(0,n) :
	if 2 ** i - 1 == n:
		flag = True
		break
if flag:
	print(f"{n} is a mersenne number.")
else:
	print(f"{n} is not a mersenne number.")