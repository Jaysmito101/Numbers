print("Odious Number Checker\n")
n = int(input("Enter the number : "))
flag = False
m = n
nfo = 0
if n <  0:
	n *= -1
while n>1 :
	nfo += n%2
	n //= 2
if n==1:
	nfo += 1
if nfo%2!=0 and m>0:
	print(f"{m} is an odious number.")
else:
	print(f"{m} is not an odious number.")