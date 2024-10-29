def palindromeString()->bool:
    str=input("Enter a string to check it's palindrome or not: ").lower()
    return str==str[::-1]

if __name__=='__main__':
    if (palindromeString()):
        print("The string is palindrome")
    else:
        print("The string is not palindrome")
