def APSeries(a,d,n):
    first_term=a
    difference=d
    no_terms=n
    sum=0
    for i in range(1,n+1):
        sum += first_term
        first_term += difference
    return sum

if __name__=='__main__':
    a=float(input("Enter the first term of the AP series: "))
    d=float(input("Enter the common difference of the AP series: "))
    n=int(input("Enter the number of terms of AP series: "))
    print("The sum of the AP series is: ",APSeries(a,d,n))