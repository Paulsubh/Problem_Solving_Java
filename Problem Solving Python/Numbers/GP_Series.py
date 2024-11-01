def GPSeries(a,r,n):
    first_term=a
    common_ratio=r
    no_terms=n
    sum=0
    for i in range(1,n+1):
        sum += first_term
        first_term *= common_ratio
    return sum

if __name__=='__main__':
    a=float(input("Enter the first term of the GP series: "))
    r=float(input("Enter the common ratio of the GP series: "))
    n=int(input("Enter the number of terms of GP series: "))
    print("The sum of the GP series is: ",GPSeries(a,r,n))