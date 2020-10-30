print("Unique Number Checker\n")
n = int(input("Enter the number : "))
flag = True
try:
	for i in range(0, len(str(n))-1) :
		if str(n).index(str(n)[i], i+1) > -1:
			flag = False
except ValueError:
	pass
if(flag) and n!=1 :
	print(f"{n} is a unique number.")
else :
	print(f"{n} is not a unique number.")