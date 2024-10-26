def repeating_elem(arr):
    n=len(arr)
    arr.sort()
    for i in range(n-1):
        if(arr[i]==arr[i+1]):
            print(arr[i],end=' ')

if __name__=="__main__":
    arr=[5,5,4,3,1,2,1]
    print("The repeating elements are: ",end=' ')
    repeating_elem(arr)