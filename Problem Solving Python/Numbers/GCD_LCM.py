def GCD(n1,n2):
    gcd=1
    for i in range(1,min(n1,n2)+1):
        if(n1%i==0 and n2%i==0):
            gcd=i
    return gcd

if __name__=='__main__':
    n1=int(input("Enter first number: "))
    n2=int(input("Enter second number: "))
    lcm=n1*n2//GCD(n1,n2)
    print(f"The GCD of {n1,n2} is :",GCD(n1,n2))
    print(f"The LCM of {n1,n2} is :",lcm)
