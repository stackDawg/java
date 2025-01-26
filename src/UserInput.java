import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        Integer age = sc.nextInt();

        System.out.println("Enter your GPA: ");
        Double gpa = sc.nextDouble();

        System.out.println("Enter p if passed and f if failed: ");


        System.out.println("Hello "+ name + ", "+ age + " years old, who's gpa is " + gpa + ".");

        sc.close();

    }
}
