import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int userDegrees = scanner.nextInt();

        /*
         *  your code goes here
         */
        int degrees;
        int minDegrees;
        int min;

          degrees = userDegrees - 180;
          
          if (degrees <=0)
          {
            degrees = 0;
          }
          else if (degrees <= 5)
          {
            degrees = 10;
          }
          else if (degrees <= 10)
          {
            degrees = 20;
          }
          else if (degrees <= 15)
          {
            degrees = 30;
          }
          else if (degrees <= 20)
          {
            degrees = 40;
          }
          else if (degrees <= 30)
          {
            degrees = 50;
          }

          min = degrees * 6;

         System.out.print(min);

        // closing the scanner object
        scanner.close();
    }
}