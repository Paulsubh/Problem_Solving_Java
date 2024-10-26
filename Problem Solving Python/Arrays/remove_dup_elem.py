def removeDupElem(arr):
    n=len(arr)
    arr.sort()
    i=0
    for j in range(1,n):
        if(arr[i]!=arr[j]):
            i+=1
            arr[i]=arr[j]
    return i+1

if __name__=='__main__':
    arr=[3,3,2,2,1]
    k=removeDupElem(arr)
    print("After removing duplicates the array is: ",end=' ')
    for i in range(0,k):
        print(arr[i],end=' ')