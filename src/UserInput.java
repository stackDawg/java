import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String result;

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        Integer age = sc.nextInt();

        System.out.println("Enter your GPA: ");
        Double gpa = sc.nextDouble();

        System.out.println("Enter true if passed, else fail: ");
        Boolean isPass = sc.nextBoolean();

        if(isPass){
            result = "passed";
        }
        else {
            result = "failed";
        }


        System.out.println("Hello "+ name + ", "+ age + " years old, who " + result + " with a gpa of " + gpa + ".");

        sc.close();

    }
}
