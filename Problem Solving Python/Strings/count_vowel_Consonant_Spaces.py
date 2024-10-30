def countVowConSpace():
    str=input("Enter a string: ").lower()
    vow,conso,space=0,0,0
    for  i in str:
        if i in "aeiou":
            vow+=1
        elif i in " ":
            space+=1
        else:
            conso+=1
    print("The number of vowels are:",vow)
    print("The number of consonants are:",conso)
    print("The number of spaces are:",space)

countVowConSpace()

