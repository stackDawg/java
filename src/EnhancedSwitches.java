import java.util.Scanner;
public class EnhancedSwitches {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();


        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Friday" -> System.out.println("It's the weekday :(");
            case "Saturday", "Sunday" -> System.out.println("It's the weekend :)");
            default -> System.out.println(day + " is not a day.");
        }

    }
}
