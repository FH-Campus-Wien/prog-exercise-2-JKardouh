package at.ac.fhcampuswien;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        float currentHighest = 0, input;
        int iteration = 1;

        System.out.print("Number " + iteration+ ": ");
        while ((input = scanner.nextFloat()) > 0){
            iteration++;
            System.out.print("Number " + iteration + ": ");
            if(input > currentHighest) currentHighest = input;
        }

        if(input <= 0 && iteration == 1) {
            System.out.println("No number entered.");
        }
        else System.out.println("The largest number is " + currentHighest+ "0");
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int lines = scanner.nextInt();
        int numbs = 1;
        if (lines < 0){
            System.out.println("Invalid number!");
            return;
        }
        for (int i=1; i <= lines; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print(numbs+ " ");
                numbs++;
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        int i, space, j;
        for(i=0; i<6; i++)
        {
            for(space=i; space<5; space++)
                System.out.print(" ");
            for(j=0; j<(i+1); j++){
                if(j==0) System.out.print("*");
                else System.out.print("**");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int height=scanner.nextInt();

        System.out.print("c: ");
        char character= scanner.next().charAt(0);

        if( height % 2 == 0){
            System.out.println("Invalid number!"); return;
        }
        int i,j,k;
         for ( i = 0; i < (height/ 2) +1; i++){ //the bigger triangle

           for(j = 0; j < (height-1) / 2-i; j++){
               System.out.print(" ");
           }
           for (j= i; j > 0; j--) {
               System.out.print((char)(character - j));
           }
           System.out.print(character);

           for (k= 1; k <= i ; k++) {
               System.out.print((char)(character - k));
           }
           System.out.println();
         }

         //second part, smaller triangle
         for( i= (height/2) -1; i >= 0; i--){

             for(j = 0; j < (height-1) / 2-i ; j++){
                 System.out.print(" ");
             }
             for (j= i; j > 0 ; j--) {
                 System.out.print((char)(character - j));
             }
             System.out.print(character);

             for (k= 1; k <= i; k++) {
                 System.out.print((char)(character - k));
             }
             System.out.println();
        }
    }


    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int input, negativeMarks = 0, numbsCount = 1, sum = 0;

        while (true) {
            System.out.printf("Mark "+numbsCount +": ");
            input = scanner.nextInt();

            if (input < 0 || input > 5) {
                System.out.println("Invalid mark!"); continue; //don't read the rest and loop.
            }

            if (input == 5) negativeMarks++;

            if (input == 0) {
                if (numbsCount > 1) numbsCount--; break; //out of this loop.
            }
            sum = sum + input;
            numbsCount++;
        }

        float average = (float) sum / numbsCount;
        System.out.printf("Average: %.2f", average); //print stream
        System.out.println();
        System.out.println("Negative marks: "+ negativeMarks );
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        boolean ResultFound = false;

        while (!ResultFound){
            int ones = number %10;
            int tens = ((number % 100) - ones) / 10;
            int hundreds = (number - (tens + ones))/100;

            int nSquaredSums = (ones * ones) + (tens * tens) + (hundreds* hundreds);
            number = nSquaredSums; // without this endless loop rip

            if (nSquaredSums == 1) {
                System.out.println("Happy number!");
                ResultFound = true;
            }
            if (nSquaredSums == 4){
                System.out.println("Sad number!");
                ResultFound = true;
            }
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();


    }
}