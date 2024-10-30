def AnagramString()->bool:
    str1=sorted(input("Enter your first string: "))
    str2=sorted(input("Enter your second string: "))
    n=len(str1)
    m=len(str2)

    if(n!=m):
        return False
    for i in range(n):
        if(str1[i]!=str2[i]):
            return False
    return True

if __name__=='__main__':
    if(AnagramString()):
        print("The two Strings are Anagram string")
    else:
        print("The two Strings are not Anagram string")
