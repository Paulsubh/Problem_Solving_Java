def nonRepeatingElem(arr):
    n=len(arr)
    arr.sort()
    if(arr[0]!=arr[1]):
        print(arr[0],end=' ')
    for i in range(1,n-1):
        if(arr[i-1]!=arr[i] and arr[i]!=arr[i+1]):
            print(arr[i],end=' ')
    if(arr[n-1]!=arr[n-2]):
        print(arr[n-1],end=' ')

if __name__=="__main__":
    arr=[5,5,4,3,1,2,1]
    print("The non repeating elements are: ",end=' ')
    nonRepeatingElem(arr)