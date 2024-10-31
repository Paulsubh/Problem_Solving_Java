def checkPalindrome():
    num=int(input("Enter a number to check palindrome or not: "))
    revNum=0
    dup=num
    while(num>0):
        ld=num%10
        revNum=(revNum*10)+ld
        num=num//10
    if(dup==revNum):
        print(f"The number {dup} is a palindrome number")
    else:
        print(f"The number {dup} is not a palindrome number")

checkPalindrome()