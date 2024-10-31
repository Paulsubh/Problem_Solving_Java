def PerfectNumber():
    num=int(input("Enter the number to check it is perfect or not: "))
    sum=0
    number=num
    for i in range(1,num):
        if(num % i==0):
            sum+=i
    if(sum==number):
        print(f"The number {number} is a perfect number")
    else:
        print(f"The number {number} is  not a perfect number")


PerfectNumber()

