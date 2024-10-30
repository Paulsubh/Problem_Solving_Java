def asciiValOfstring():
    str=input("Enter a string to check: ")
    for i in str:
        ascii=ord(i)
        print(f"The ascii value of {i}  is :",ascii)

asciiValOfstring()