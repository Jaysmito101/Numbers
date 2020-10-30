print("Smith Number Checker\n")
n = int(input("Enter the number : "))
m = n
p = 2
s = 0
pfs = 0
flag = True
while m > 1:
	if m % p == 0:
		for digit in str(p):
			pfs += int(digit)
		m /= p 
	else:
		p += 1
for digit in str(n):
	s += int(digit)
if s == pfs:
	print(f"{n} is a smith number.")
else :
	print(f"{n} is not a smith number.")