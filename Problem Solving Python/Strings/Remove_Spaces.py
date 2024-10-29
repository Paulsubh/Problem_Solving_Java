def removeSpaces():
    str=input("Enter the string to remove spaces:")
    result=""
    for char in str:
        if char not in " ":
            result+=char
    print(result)


removeSpaces()
