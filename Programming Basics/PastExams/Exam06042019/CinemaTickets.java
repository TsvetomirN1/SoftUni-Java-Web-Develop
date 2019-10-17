package Exam06042019;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;

        while (!(movieName.equals("Finish"))) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int people = 0;

            for (int i = 0; i < freeSeats; i++) {
                {
                    String ticket = scanner.nextLine();

                    if (ticket.equals("student")) {
                        studentCounter++;

                    } else if (ticket.equals("standard")) {
                        standardCounter++;

                    } else if (ticket.equals("kid")) {
                        kidCounter++;
                    } else if ("End".equals(ticket))
                        break;
                }
                people++;
            }

            System.out.println(String.format("%s - %.2f%% full.", movieName, people * 1.0 / freeSeats * 100));
            movieName = scanner.nextLine();
        }

        int totalTickets = standardCounter + studentCounter + kidCounter;
        System.out.println(String.format("Total tickets: %d", totalTickets));
        System.out.println(String.format("%.2f%% student tickets.", (studentCounter * 1.0 / totalTickets * 100)));
        System.out.println(String.format("%.2f%% standard tickets.", (standardCounter * 1.0 / totalTickets * 100)));
        System.out.println(String.format("%.2f%% kids tickets.", (kidCounter * 1.0 / totalTickets * 100)));
    }
}

