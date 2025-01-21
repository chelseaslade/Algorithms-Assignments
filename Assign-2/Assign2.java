import java.util.Arrays;
import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        //Simulate a movie theater that helps users to book and reserve seats.
        //1. Reserve seats (if seat is taken, let them know it is taken and suggest an available seat)
        //2. Cancel seats
        //3. Retrieve initial seating charting

       int[][] theatreSeats = {{1, 2, 3, 4}, {1, 2, 3, 4, 5}};

       Scanner sc = new Scanner(System.in);

       System.out.println("Book your preferred theatre seat!");
       System.out.println("Enter what row you would like: (A, B, C, or D) ");
       System.out.println("Enter what seat number you would like: (1, 2, 3, 4, or 5) ");
    }
    }