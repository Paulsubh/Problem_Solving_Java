def Factorial(n):
    fact=1
    for i in range(1,n+1):
        fact=fact*i
    return fact

if __name__=='__main__':
    n=int(input("Enter a value of n: "))
    r=int(input("Enter a value of r: "))
    permutation=(Factorial(n)/Factorial(n-r))
    combination=Factorial(n)/(Factorial(r)*Factorial(n-r))
    print("The permutation is: ",permutation)
    print("The combination is: ",combination)