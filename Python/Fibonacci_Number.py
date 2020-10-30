print("Fibonacci Number Checker\n")
n = int(input("Enter the number : "))
flag = False
a=1
b=1
c=0
while n>=b:
	if b==n:
		flag=True
		break
	c=b
	b=a+b
	a=c
if flag:
	print(f"{n} is a fibonacci number.")
else:
	print(f"{n} is not a fibonacci number.")