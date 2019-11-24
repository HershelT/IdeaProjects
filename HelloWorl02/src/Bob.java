import java.lang.instrument.ClassDefinition;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Bob {
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
        System.out.println("Welcome to the Matrix" +
                " Now You can access everything there is to offer!!");
        String name;
        Scanner UserInput = new Scanner(System.in);
        System.out.println("What is your name?");
        name = UserInput.nextLine();
        System.out.println("Hello " + name + "!");
        int Age;
        System.out.println("what is your age?");
        Age = UserInput.nextInt();
        if (Age >= 13) {
            System.out.println("Congratulations you are over bar mitzvah because you are " + Age);
        } else if (Age < 13) {
            System.out.println("You are almost bar mitzvah because your are " + Age);
        } else {
            System.out.println("You did not provide a number so we will continue!");
        }
        Scanner Calculator = new Scanner(System.in);
        String Calc;
        String Addition;
        String Subtraction;
        String Multiplication;
        String Division;
        Subtraction = "Subtract";
        Multiplication = "Multiply";
        Division = "Divide";
        Addition = "Add";
        int Working;
        Working = 0;
        while (Working == 0) {
            System.out.println("Welcome to the calculator world. Would you like to Add, Subtract, Multiply, or Divide?");
            Calc = Calculator.nextLine();
            if (Calc.equals(Addition)) {
                System.out.println("You would like to add. Please type in your first number that you want to add");
                int FirstN;
                FirstN = Calculator.nextInt();
                System.out.println("Your first number is " + FirstN + " Now please type in your second number you would like to add");
                int SecondN;
                SecondN = Calculator.nextInt();
                System.out.println("Your second Number is " + SecondN + " Now I will do my magic and add your numbers together");
                System.out.println("Calculating...");
                int Final;
                Final = FirstN + SecondN;
                System.out.println("Your final answer is " + Final);
                Scanner YesorNo = new Scanner(System.in);
                String YorN;
                String Yes;
                Yes = "Yes";
                String No;
                No = "No";
                int YN;
                YN = 1;
                System.out.println("Do you want to continue with the calculator? Yes or No");
                while (YN == 1) {
                    YorN = YesorNo.nextLine();
                    if (YorN.equals(Yes)) {
                        System.out.println("You would like to continue!");
                        YN = 0;
                    } else if (YorN.equals(No)) {
                        System.out.println("You would not like to continue");
                        Working = 1;
                        YN = 0;
                        break;
                    } else {
                        System.out.println("Invalid answer! Make sure the first letter is capatalized!");
                        System.out.println("Try again! Yes or No");
                    }
                }

            }
            if (Calc.equals(Subtraction)) {
                System.out.println("You would like to Subtract. Please type in your first number that you want to Subtract");
                int FirstN;
                FirstN = Calculator.nextInt();
                System.out.println("Your first number is " + FirstN + " Now please type in your second number you would like to subtract");
                int SecondN;
                SecondN = Calculator.nextInt();
                System.out.println("Your second Number is " + SecondN + " Now I will do my magic and subtract your numbers from eachother");
                System.out.println("Calculating...");
                int Final;
                Final = FirstN - SecondN;
                System.out.println("Your final answer is " + Final);
                Scanner YesorNo = new Scanner(System.in);
                String YorN;
                String Yes;
                Yes = "Yes";
                String No;
                No = "No";
                int YN;
                YN = 1;
                System.out.println("Do you want to continue with the calculator? Yes or No");
                while (YN == 1) {
                    YorN = YesorNo.nextLine();
                    if (YorN.equals(Yes)) {
                        System.out.println("You would like to continue!");
                        YN = 0;
                    } else if (YorN.equals(No)) {
                        System.out.println("You would not like to continue");
                        Working = 1;
                        YN = 0;
                        break;
                    } else {
                        System.out.println("Invalid answer! Make sure the first letter is capatalized!");
                        System.out.println("Try again! Yes or No");
                    }
                }


            }
            if (Calc.equals(Multiplication)) {
                System.out.println("You would like to multiply. Please type in your first number that you want to multiply");
                int FirstN;
                FirstN = Calculator.nextInt();
                System.out.println("Your first number is " + FirstN + " Now please type in your second number you would like to multiply");
                int SecondN;
                SecondN = Calculator.nextInt();
                System.out.println("Your second Number is " + SecondN + " Now I will do my magic and multiply your numbers together");
                System.out.println("Calculating...");
                int Final;
                Final = FirstN * SecondN;
                System.out.println("Your final answer is " + Final);
                Scanner YesorNo = new Scanner(System.in);
                String YorN;
                String Yes;
                Yes = "Yes";
                String No;
                No = "No";
                int YN;
                YN = 1;
                System.out.println("Do you want to continue with the calculator? Yes or No");
                while (YN == 1) {
                    YorN = YesorNo.nextLine();
                    if (YorN.equals(Yes)) {
                        System.out.println("You would like to continue!");
                        YN = 0;
                    } else if (YorN.equals(No)) {
                        System.out.println("You would not like to continue");
                        Working = 1;
                        YN = 0;
                        break;
                    } else {
                        System.out.println("Invalid answer! Make sure the first letter is capatalized!");
                        System.out.println("Try again! Yes or No");
                    }
                }
            }
            if (Calc.equals(Division)) {
                System.out.println("You would like to divide Please type in your first number that you want to divide");
                int FirstN;
                FirstN = Calculator.nextInt();
                System.out.println("Your first number is " + FirstN + " Now please type in your second number, which is the denominator");
                int SecondN;
                SecondN = Calculator.nextInt();
                System.out.println("Your second Number is " + SecondN + " Now I will do my magic and divide your numbers from eachother");
                System.out.println("Calculating...");
                int Final;
                int Remainder;
                Remainder = FirstN % SecondN;
                Final = FirstN / SecondN;
                System.out.println("Your final answer is " + Final + " Your remainder is " + Remainder);
                Scanner YesorNo = new Scanner(System.in);
                String YorN;
                String Yes;
                Yes = "Yes";
                String No;
                No = "No";
                int YN;
                YN = 1;
                System.out.println("Do you want to continue with the calculator? Yes or No");
                while (YN == 1) {
                    YorN = YesorNo.nextLine();
                    if (YorN.equals(Yes)) {
                        System.out.println("You would like to continue!");
                        YN = 0;
                    } else if (YorN.equals(No)) {
                        System.out.println("You would not like to continue");
                        Working = 1;
                        YN = 0;
                        break;
                    } else {
                        System.out.println("Invalid answer! Make sure the first letter is capatalized!");
                        System.out.println("Try again! Yes or No");
                    }
                }
            } else{
                System.out.println("Invalid answer. Try Again!! Make sure the first letter is capitalized!!");
            }
        }
        System.out.println("Congratulations you finished working on the calculator");

    }

}

