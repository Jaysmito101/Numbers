print("Magic Number Checker\n")
n = int(input("Enter the number : "))
s=0
m=n
while  m>0:
	s += m % 10
	m //= 10
	if s>9 and m == 0:
		m = s
		s = 0
if s==1:
	print(f"{n} is a magic number.")
else:
	print(f"{n} is not a magic number.")