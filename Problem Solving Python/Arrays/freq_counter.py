def freq_counter(arr):
    arr.sort()
    n=len(arr)
    count=1
    for i in range(n):
        if(arr[i-1]==arr[i]):
            count+=1
        else:
            print(f"The count of element {arr[i-1]} is ",count)
            count=1
    print(f"The count of element {arr[n-1]} is ", count)

if __name__=="__main__":
    arr= [10,10,30,30,20,50,50,50,40]
    freq_counter(arr)