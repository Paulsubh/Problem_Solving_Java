def Amstrongnumber():
    num=int(input("Enter a number to check amstrong number or not: "))
    k=len(str(num))
    sum=0
    number=num
    while(num>0):
        ld=num%10
        sum+=(ld**k)
        num=num//10
    if(sum==number):
        print(f"The  number {number} is a Amstrong Number")
    else:
         print(f"The  number {number} is not a Amstrong Number")

Amstrongnumber()

