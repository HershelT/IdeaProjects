import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        int pinNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR PIN");
        pinNumber = input.nextInt();

        while (pinNumber != 8173) {
            System.out.println("INCORRECT PIN TRY AGAIN");
            System.out.println("ENTER YOUR PIN");
            pinNumber = input.nextInt();
        }
        System.out.println("Welcome to the Matrix");
        for (int x = 10; x <= 100; x += 1) {
            if (x <= 30) {
                continue;
            }
            System.out.println(x);
        }



    }
}