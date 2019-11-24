import java.util.ArrayList;
public class yes {
    public static void main(String[] args) {
        int row;
        int column;
        for(row = 1; row <=8; row++) {
            for(column = 1; column <= 8; column++) {
                System.out.print("[col " + column + " row " + row + "] ");

            }
            System.out.println("");
        }
        String[] users = {"Hershel", "Jacob", "Jonathan", "Layla" , "Mommy", "Daddy"};
        for (String user: users) {
            System.out.println(user);
        }


}


}

