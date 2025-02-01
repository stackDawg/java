import java.util.Scanner;

public class CircleCircArVol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Let's find the circumference, area and volume of a circle.");
        System.out.print("Enter the radius of the circle (in cm): ");
        radius = sc.nextDouble();
        sc.close();

        circumference = 2*Math.PI*radius;
        area = Math.PI*Math.pow(radius,2);
        volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);

        System.out.println("Circumference: "+circumference+" cms");
        System.out.println("Area: "+area+" cm^2");
        System.out.println("Volume: "+volume+ " cm^3");







    }
}
