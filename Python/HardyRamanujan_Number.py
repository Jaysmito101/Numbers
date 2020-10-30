print("HardyRamanujan Number Checker\n")
n = int(input("Enter the number : "))
flag = False
co =0
mylist = []
for i in range(0, int(n ** (1/3)) + 1):
	for j in range(0, int(n ** (1/3))):
		if (i*i*i) + (j*j*j) == n and i != j and ((str(i) + str(j)) not in mylist) and ((str(j) + str(i)) not in mylist):
			mylist.append(str(i) + str(j))	
			co += 1
			if co == 2:
				flag = True
				break
	if flag:
		break
if(flag):
	print(f"{n} is a hardyramanujan number.")
else :
	print(f"{n} is not a hardyramanujan number.")