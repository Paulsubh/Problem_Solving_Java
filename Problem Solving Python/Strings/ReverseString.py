def ReverseString(str):
    rev=""
    n=len(str)
    for i in range(n-1,-1,-1):
        rev+=str[i]
    return rev

if __name__=='__main__':
    str="Subhajit"
    print(ReverseString(str))