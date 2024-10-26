def largest_element(arr):
    n=len(arr)
    max=arr[0]
    for i in range(1,n-1):
        if(arr[i]>max):
            max=arr[i]
    return max


if __name__=='__main__':
    arr=[10,20,30,50,40]
    print("The largest element is :",largest_element(arr))
