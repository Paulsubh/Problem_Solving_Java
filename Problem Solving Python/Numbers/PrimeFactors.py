def Prime(n):
    count=0
    for i in range(1,n+1):
        if(n%i==0):
            count+=1
    if(count==2):
        return True
    else:
        return False

if __name__=='__main__':
    n=int(input("Enter a number: "))
    for i in range(1,n+1):
        if(n%i==0 and Prime(i)):
            print(i," : is a prime factor")