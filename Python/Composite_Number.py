print("Composite Number Checker\n")
n = int(input("Enter the number : "))
flag = False
for i in range(2, n//2+1) :
	if n%i == 0:
		flag = True
		break
if(flag):
	print(f"{n} is a composite number.")
else :
	print(f"{n} is not a composite number.")