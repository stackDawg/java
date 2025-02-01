import java.util.Scanner;

public class FindHypotenuse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Let's find the hypotenuse of a triangle.");
        System.out.print("Enter the length of side A (in cms): ");
        a = sc.nextDouble();
        System.out.print("Enter the length of side B (in cms): ");
        b = sc.nextDouble();

        c = Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));

        System.out.println("The hypotenuse of the triangle is: "+c+" cms.");

    }
}
