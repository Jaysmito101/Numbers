print("TwistedPrime Number Checker\n")
n = int(input("Enter the number : "))
m =int(str(n)[::-1])
flag = True
for i in range(2, max(n,m)//2 +1):
	if n % i == 0 or m % i == 0:
		flag = False
		break
if  flag and n!=1 and m!=1:
	print(f"{n} is a twistedprime number.")
else:
	print(f"{n} is not a twistedprime number.")