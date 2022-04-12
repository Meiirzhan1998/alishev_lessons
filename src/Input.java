import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        String string = sc.nextLine();
        System.out.println("Enter num: ");
        int myInt = sc.nextInt();
        System.out.println("You entered: "+string);
        System.out.println("You entered num: "+myInt);

    }
}
