def maxOccuringChar():
    str=input("Enter the string to check maximum occuring character: ")
    n=len(str)
    maxfreq=0
    result='a'
    for i in range(n):
        count=0
        for j in range(i+1,n):
            if(str[i]==str[j]):
                count+=1
        if(count>maxfreq):
            maxfreq=count
            result=str[i]
    print(result)

maxOccuringChar()
