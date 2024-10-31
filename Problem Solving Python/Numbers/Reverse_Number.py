def ReverseNumber(n):
    is_negative = n < 0
    n = abs(n)  # Work with the positive version of n
    revNum = 0
    while(n>0):
        ld=n%10
        revNum=(revNum*10)+ld
        n=n//10
    if(is_negative):
        return -revNum
    else:
        return revNum

if __name__=='__main__':
    n=int(input("Enter a number: "))
    print(f"The reverse number of {n} is:",ReverseNumber(n))
