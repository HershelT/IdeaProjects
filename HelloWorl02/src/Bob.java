import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
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
        System.out.println("Welcome to the calculator world. Would you like to Add, Subtract, Multiply, or Divide?");
        String Calc;
        String Addition;
        Addition = "Add";
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
        } else {
            System.out.println("Hey");
        }

    }

}
