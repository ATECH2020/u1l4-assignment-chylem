import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int studentsA = scanner.nextInt();
        int studentsB = scanner.nextInt();
        int studentsC = scanner.nextInt();

        /*
         *  your code goes here
         */
       int desksA;
       int desksB;
       int desksC;
       int desksAM;
       int desksBM;
       int desksCM;
       int totalDesks;
 
       desksA = studentsA / 2;
       desksB = studentsB / 2;
       desksC = studentsC / 2;
       desksAM = studentsA % 2;
       desksBM = studentsB % 2;
       desksCM = studentsC % 2;
       totalDesks = desksA + desksB + desksC + desksAM + desksBM + desksCM;
       System.out.print(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}