import math

def roots(a, b, c):
    if a == 0:
        print("Invalid")
        return

    d = b * b - 4 * a * c
    sqrt_val = math.sqrt(abs(d))

    if d > 0:
        print("Roots are real and different")
        root1 = (-b + sqrt_val) / (2 * a)
        root2 = (-b - sqrt_val) / (2 * a)
        print(f"{root1}\n{root2}")

    elif d == 0:
        print("Roots are real and same")
        root1 = -b / (2 * a)
        root2 = -b / (2 * a)
        print(f"{root1}\n{root2}")

    else:
        print("Roots are complex")
        real_part = -b / (2 * a)
        imaginary_part = sqrt_val / (2 * a)
        print(f"{real_part} + i{imaginary_part}\n{real_part} - i{imaginary_part}")

if __name__=='__main__':
    a=int(input("Enter the value of a: "))
    b=int(input("Enter the value of b: "))
    c=int(input("Enter the value of c: "))
    roots(a,b,c)