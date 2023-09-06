package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterApplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

        String reservationName = "";
        LocalDate reservationDate;
        int numberOfTickets = 0;

        System.out.print("Please enter your name: ");
        String fullName = in.nextLine().strip();
        System.out.print("What date will you be coming (mm/dd/yyyy)? ");
        reservationDate = LocalDate.parse(in.nextLine().strip(), formatter);
        System.out.print("How many tickets would you like? ");
        numberOfTickets = Integer.parseInt(in.nextLine().strip());

        String[] nameParts = fullName.split(" ");
        if(nameParts.length > 1)
        {
            reservationName = nameParts[1] + ", " + nameParts[0];
        }
        else
        {
            reservationName = fullName;
        }

        String ticket = numberOfTickets > 1 ? "tickets" : "ticket";

        System.out.println(numberOfTickets + " " + ticket + " reserved for " + reservationDate + " under " + reservationName);
    }
}