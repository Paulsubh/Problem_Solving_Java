def increasingDecreasing(arr):
    n=len(arr)
    arr.sort()
    for i in range(0,n//2):
        print(arr[i],end=' ')
    for i in range(n-1, n//2 - 1,-1):
        print(arr[i],end=' ')


if __name__=='__main__':
    arr=[1,3,4,2,5,8,6,9,7]
    increasingDecreasing(arr)