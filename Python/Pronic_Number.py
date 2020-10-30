print("Pronic Number Checker\n")
n = int(input("Enter the number : "))
flag = False
a=1
b=2
while n>=b//2:
	if a*b==n:
		flag=True
		break
	a += 1
	b += 1
if flag:
	print(f"{n} is a pronic number.")
else:
	print(f"{n} is not a pronic number.")