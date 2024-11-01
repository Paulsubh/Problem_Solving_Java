def sumOfDigitsNumber(n):
    n = abs(n)
    sum=0
    while(n!=0):
        ld=n%10
        sum+=ld
        n=n//10
    return sum

if __name__=='__main__':
    n=int(input("Enter a number: "))
    print("The sum of the digits is: ",sumOfDigitsNumber(n))