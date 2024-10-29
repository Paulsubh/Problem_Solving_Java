def removeCharFromFirstString():
    str1=input("Enter your first string: ")
    str2=input("Enter your second string: ")
    n=len(str1)
    m=len(str2)
    result=""
    for i in range(n):
        flag=0
        for j in range(m):
            if(str1[i]==str2[j]):
                flag=1
        if(flag!=1):
            result+=str1[i]
    print(result)

removeCharFromFirstString()