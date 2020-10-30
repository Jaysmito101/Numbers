print("MultipleHarshad Number Checker\n")
n = int(input("Enter the number : "))
s=0
flag = True
m=n
p=n
while  m>0:
	s += m % 10
	m //= 10
	if s>9 and m == 0:
		if p % s == 0 :
			m = p/s
			s = 0
			p = m
		else:
			flag= False
			break
if flag:
	print(f"{n} is a multipleharshad number.")
else:
	print(f"{n} is not a multipleharshad number.")