import java.util.Arrays;
import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        //Calculate the average temperature, and give how many days are above the average temperature
        //1. Take an input from the user (eg. 5)
        //2. Prompt the user to enter all the 5 numbers (temperature values)
        //3. Calculate the average temperature
        //4. Given the average temperature, how many of the numbers in the line 2 are above the average temperature?

        //User Input
        Scanner sc = new Scanner(System.in);
        int[] tempArray = new int[5];

        System.out.println("Enter the first temperature: ");
        int tempOne = sc.nextInt();
        tempArray[0] = tempOne;
        sc.nextLine();

        System.out.println("Enter the second temperature: ");
        int tempTwo = sc.nextInt();
        tempArray[1] = tempTwo;
        sc.nextLine();

        System.out.println("Enter the third temperature: ");
        int tempThree = sc.nextInt();
        tempArray[2] = tempThree;
        sc.nextLine();

        System.out.println("Enter the fourth temperature: ");
        int tempFour = sc.nextInt();
        tempArray[3] = tempFour;
        sc.nextLine();

        System.out.println("Enter the fifth temperature: ");
        int tempFive = sc.nextInt();
        tempArray[4] = tempFive;
        sc.nextLine();

        System.out.println(Arrays.toString(tempArray));

        //Calculate Average
        int avgTemp = (Arrays.stream(tempArray).sum()) / tempArray.length;
        System.out.println("Average Temperature: " + avgTemp);

        //Return numbers above average
        System.out.println("Temperatures above average: ");
        for (int i : tempArray) {
            try {
                if (i > avgTemp) {
                    System.out.println(i);
                }
            }
            catch (Exception e) {
                System.out.println("Array not accessible.");
        }
        }
    }
}