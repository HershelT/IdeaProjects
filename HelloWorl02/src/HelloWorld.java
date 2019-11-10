public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");


        String place = "Europe";
        int day = 5;
        int flight = 5000;
        int transportation = 65 * day;
        int kosherfood = 100;
        int data = 50 * day;
        if (place == "Europe") {
            flight = 6500;
            kosherfood = 100;
            transportation = 70 * day;
        } else if (place ==  "Isreal") {
            flight = 5000;
            kosherfood = 50;
        }
        int total = flight + kosherfood + data + transportation;
        System.out.println("Your Vacation Cost is " + total);

        double pounds = 1000;
        double conversionRate = 0.75;
        double dollars = pounds * conversionRate;
        System.out.println("You had " + pounds + " pounds which is " + dollars + " dollars because of the conversion rate of " + conversionRate);


    }
}



