def checkPrime():
    num=int(input("Enter a number to check prime or not: "))
    count=0
    for i in range(1,num+1):
        if(num%i==0):
            count+=1
    if(count==2):
        print(f"The number {num} is a prime number")
    else:
        print(f"The number {num} is not a Prime number")

checkPrime()