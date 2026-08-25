import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("What do you do for work? ");
        String work = scanner.nextLine();
        System.out.println("Hello, " + name + "! As a " + work + ", you are in exactly the right place!");
        scanner.close();
    }
}
