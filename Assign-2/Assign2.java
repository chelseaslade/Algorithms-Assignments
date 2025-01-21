import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Assign2 {
    public static void main(String[] args) {
        //Simulate a movie theater that helps users to book and reserve seats.
        //1. Reserve seats (if seat is taken, let them know it is taken and suggest an available seat)
        //2. Cancel seats
        //3. Retrieve initial seating charting

        int[][] emptyTheatreSeats = {{1, 2, 3, 4}, {1, 2, 3, 4, 5}};
        ArrayList<String> bookedSeats = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        boolean menuLoop = true;

        //Menu Loop
        while (menuLoop = true) {
            System.out.println("Select an option below (1, 2 or 3): ");
            System.out.println("1. Book a Theatre Seat");
            System.out.println("2. Cancel a seat booking");
            System.out.println("3. Exit");
            int menuSelect = sc.nextInt();
            sc.nextLine();

            switch (menuSelect) {
                //Book
                case 1:

                        System.out.println("Enter what row you would like: (A, B, C, or D) ");
                        String rowSelect = sc.nextLine().toUpperCase();

                        int rowInt = 5;

                        switch (rowSelect)
                        {
                            case "A":
                                rowInt = 0;
                            case "B":
                                rowInt = 1;
                            case "C":
                                rowInt = 2;
                            case "D":
                                rowInt = 3;
                        }

                        if (rowSelect.isEmpty())
                        {
                            System.out.println("Row selection cannot be empty, please try again.");
                            break;
                        }
                        if (rowInt > 4)
                        {
                            System.out.println("Please select a valid row (A, B, C or D) ");
                            break;
                        }

                        System.out.println("Enter what seat number you would like: (1, 2, 3, 4, or 5) ");
                        int seatSelect = sc.nextInt();
                        sc.nextLine();

                        String seatBooked = rowSelect + seatSelect;

                        if (bookedSeats.contains(seatBooked)) {
                            System.out.println("Sorry! That seat is booked. Please select another seat. ");
                            System.out.println("The following seats are available in your selected row: ");
                        } else {
                            bookedSeats.add(seatBooked);
                            System.out.println("You have booked the following seat: " + seatBooked);
                            break;
                        }
                    break;

                //Cancel
                case 2:
                    System.out.println("Enter which of the following booked seats you would like to cancel: (Ex. 'A3') ");

                    for (int i = 1; i < bookedSeats.size(); i++)
                    {
                        System.out.println(i + "." + bookedSeats.get(i));
                    }

                    String cancelSeat = sc.nextLine();
                    bookedSeats.remove(cancelSeat);
                    break;

                //Exit
                case 3:
                    menuLoop = false;
                    break;
            }
        }

    }
}