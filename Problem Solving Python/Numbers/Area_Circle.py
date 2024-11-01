import math

def AreaCircle(r):
    area=math.pi*(r**2)
    return area

if __name__=='__main__':
    radius=float(input("Enter the radius of the circle: "))
    print("The area of the circle is :",AreaCircle(radius))