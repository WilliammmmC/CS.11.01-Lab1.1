import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println(age);
        System.out.println("minimum age to date:");
        System.out.println(age/2 + 7);



    }
}
