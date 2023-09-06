package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";

        System.out.println("Please enter your name: ");
        System.out.print("First name: ");
        firstName = in.nextLine().strip();
        System.out.print("Middle name: ");
        middleName = in.nextLine().strip();
        System.out.print("Last name: ");
        lastName = in.nextLine().strip();
        System.out.print("Suffix: ");
        suffix = in.nextLine().strip();

        System.out.print("Full name: " + firstName + " " );
        if (!middleName.isEmpty())
            System.out.print(middleName + " ");
        System.out.print(lastName);
        if(!suffix.isEmpty())
            System.out.print(", " + suffix + " ");
        System.out.println();

    }
}
