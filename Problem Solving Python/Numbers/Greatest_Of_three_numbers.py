def greatestOfthreeNumbers(a,b,c):
    if(a>b and a>c):
        print(f"The number {a} is greatest!")
    elif(b>c):
        print(f"The number {b} is greatest!")
    else:
        print(f"The number {c} is greatest!")


if __name__=='__main__':
    a=int(input("Enter the first number: "))
    b=int(input("Enter the second number: "))
    c=int(input("Enter the third number: "))
    greatestOfthreeNumbers(a,b,c)