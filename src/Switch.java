import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
//        int age = sc.nextInt();
//            switch (age) {
//                case 0:
//                    System.out.println("You are born");
//                    break;
//                case 7:
//                    System.out.println("You are in first class");
//                    break;
//                case 18:
//                    System.out.println("You are finished school");
//                    break;
//                default:
//                    System.out.println("I don't know");
//            }
        String age = sc.nextLine();
        switch (age) {
            case "zero":
                System.out.println("You are born");
                break;
            case "seven":
                System.out.println("You are in first class");
                break;
            case "eighteen":
                System.out.println("You are finished school");
                break;
            default:
                System.out.println("I don't know");
        }
    }
}

