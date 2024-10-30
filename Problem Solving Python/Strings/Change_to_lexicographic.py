def changeToLexicographic():
    str=input("Enter a string: ").upper()
    n=len(str)
    result=""
    for i in range(n):
        ascii=ord(str[i])
        if(ascii==90):
            result+=chr(65)
        elif(65<=ascii<=90):
            result+=chr(ascii+1)
        else:
            result+=str[i]
    print(result)

changeToLexicographic()
