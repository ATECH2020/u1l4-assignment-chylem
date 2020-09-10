import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours = scanner.nextInt(); 


        /*
         *  your code goes here
         */
         int degrees; 

          degrees = (hours % 30) * 12;

          System.out.print(degrees);
        // closing the scanner object
        scanner.close();
    }
}