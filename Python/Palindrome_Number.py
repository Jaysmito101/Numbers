print("Palindrome Number Checker\n")
n = int(input("Enter the number : "))
if str(n) == str(n)[::-1]:
	print(f"{n} is a palindrome number.")
else:
	print(f"{n} is not a palindrome number.")