import re

def removeBrackets():
    str=input("Enter your string to remove brackets: ")
    str = re.sub(r"[(){}\[\]]", "", str)
    print(str)

removeBrackets()
        