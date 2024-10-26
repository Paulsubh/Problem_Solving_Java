def medOfAllElem(arr):
    arr.sort()
    n=len(arr)
    if(n%2==0):
        med1=(n//2) -1
        med2=n//2
        avg=(arr[med1]+arr[med2])/2
        print("The median of the array is :",avg)
    else:
        med=arr[n//2]
        print("The median of the array is ",med)

if __name__=='__main__':
    arr1=[1,2,3,4,5]
    medOfAllElem(arr1)
    arr2=[1,2,3,4]
    medOfAllElem(arr2)
