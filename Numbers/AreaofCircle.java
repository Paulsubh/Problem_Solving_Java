import java.lang.Math;
import java.util.Scanner;

public class AreaofCircle {
    public static double checkArea(double r){
        double area=Math.PI*(r*r);
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius:");
        double rad=sc.nextDouble();
        System.out.println("The area of the circle is:"+checkArea(rad));

        
    }
    
}
