def removeCharacterString():
    str=input("Enter a String to check: ")
    n=len(str)
    result=""
    for i in range(n):
        ascii_value = ord(str[i])
        if(65<=ascii_value<=90 or 97<=ascii_value<=122):
            result+=str[i]
    print(result)

removeCharacterString()