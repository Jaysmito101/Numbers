print("Duck Number Checker\n")
n = int(input("Enter the number : "))
flag = False
for digit in str(n) :
	if digit == "0":
		flag = True
		break
if flag:
	print(f"{n} is a duck number.")
else:
	print(f"{n} is not a duck number.")