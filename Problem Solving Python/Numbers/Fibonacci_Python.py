def Fibonacci(n):
    if n < 0:
        print("Incorrect input")
    elif n == 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        return Fibonacci(n-1) + Fibonacci(n-2)

if __name__=='__main__':
    n=int(input("Enter your number: "))
    print(f"The value of {n}th fibonacci is: ",Fibonacci(n))

    print("The fibonacci series is: ",end=' ')
    for i in range(n):
        print(Fibonacci(i)," ",end='')