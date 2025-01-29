import java.util.Scanner;

public class IsEmpty {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        if (name.isEmpty()){
            System.out.println("You didn't enter anything.");
        }
        else {
            System.out.println("Hello " + name);
        }

    }
}
