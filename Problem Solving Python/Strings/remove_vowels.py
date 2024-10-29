def removeVowels():
   str = input("Enter the String to remove the vowels: ").lower()
   result = ""
   for char in str:
    if char not in "aeiou":
       result += char
   print(result)
   
removeVowels()