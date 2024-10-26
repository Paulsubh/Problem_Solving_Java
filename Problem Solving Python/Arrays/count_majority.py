def countMajority(arr):
    n=len(arr)
    arr.sort()
    for i in range(n):
        count=0
        for j in range(n):
            if(arr[i]==arr[j]):
                count+=1
        if(count>n/2):
            return arr[i]

if __name__=='__main__':
    arr=[1,2,3,3,3,3]
    major=countMajority(arr)
    print("The majority element is :", major)