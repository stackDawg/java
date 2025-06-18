import java.util.Scanner;
public class IfElseUsingTernOp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 9: ");
        int user_input = sc.nextInt();

//        if (user_input == 3) {
//            System.out.println("The user input was 3");
//        }
//        else {
//            System.out.println("The user input was not 3");
//        }

        String output = (user_input == 5) ? "The user input was 5" : "The user input was not 5";
        System.out.println(output);


    }
}
