def removeDuplicateChar():
    str=input("Enter a String to remove duplicate char: ").lower()
    str=sorted(str)

    n=len(str)
    result=str[0]
    for i in range(1,n):
        if(str[i]!=str[i-1]):
            result+=str[i]
    print(result)


removeDuplicateChar()