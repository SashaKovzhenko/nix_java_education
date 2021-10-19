package nix.education.java;
import java.util.Scanner;

public class chatbot{
    public static void main(String []args){
        System.out.println("Hello! My name is Dora.\nI was created in 2021");
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(("What a great name you have," + name));
        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7");
        int remaider3 = scanner.nextInt();
        int remaider5 = scanner.nextInt();
        int remaider7 = scanner.nextInt();
        int age = ((remaider3 * 70 + remaider5 * 21+ remaider7 * 15) % 105);
        System.out.println(("Your age is " +age + "; that's a good time to start programming!"));
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        int num = 0;
        while (num < number) {
            num ++;
            System.out.println(num + "!");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several.");
        System.out.println("3. To determinate the execution time of a program.");
        System.out.println("4. To interrupt the execution of the program.");
        while (true) {
            String response = scanner.next();
            if (response.equals ("2")) {
                System.out.println("Great, you right!\nGoodbye, have a nice day!");
                break;
            }
            else {
                System.out.println("Please, try again");
            }
        }
    }
}
