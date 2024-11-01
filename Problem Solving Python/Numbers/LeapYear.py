def LeapYear(n):
    if(n%400==0 or n%100!=0 and n%4==0):
        return True
    else:
        return False

if __name__=='__main__':
    n=int(input("Enter a year to check leap-year: "))
    if(LeapYear(n)):
        print(f"The year {n} is a leap-year")
    else:
         print(f"The year {n} is not a leap-year")
