def sumOfNaturalNumbers(n):
    sum=0
    for i in range(1,n+1):
        sum+=i
    return sum

if __name__=='__main__':
    n=int(input("Enter a number to check sum of the natural numbers: "))
    print("The sum of the numbers is :",sumOfNaturalNumbers(n))
