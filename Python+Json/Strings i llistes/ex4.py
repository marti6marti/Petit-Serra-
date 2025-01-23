str1 = input("Enter a string: ")
vowels = "aeiouAEIOU"
count = sum(1 for char in str1 if char in vowels)
print("Number of vowels:", count)
