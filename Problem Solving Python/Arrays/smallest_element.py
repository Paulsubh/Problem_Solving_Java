def largest_element(arr):
    n=len(arr)
    min=arr[0]
    for i in range(1,n-1):
        if(arr[i]<min):
            min=arr[i]
    return min


if __name__=='__main__':
    arr=[10,20,30,50,40]
    print("The samllest element is :",largest_element(arr))