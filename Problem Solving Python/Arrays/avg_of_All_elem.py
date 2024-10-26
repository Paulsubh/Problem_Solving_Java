def avgOfAllElem(arr):
    n=len(arr)
    sum=0
    for i in arr:
        sum+=i
    avg=sum/n
    return avg

if __name__=="__main__":
    arr=[1,2,3,4,5]
    print("The average of all element is: ",avgOfAllElem(arr))