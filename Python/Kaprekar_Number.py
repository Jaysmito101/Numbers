print("Kaprekar Number Checker\n")
n = int(input("Enter the number : "))
sq = n * n
flag = False
s = 0
for i in range(1, len(str(sq))-1):
	if int(str(sq)[0:i]) + int(str(sq)[i:]) == n:
		flag = True
		break
if flag:
	print(f"{n} is a kaprekar number.")
else :
	print(f"{n} is not a kaprekar number.")