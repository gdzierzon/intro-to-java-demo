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

        System.out.print("Please enter a name: ");
        String input = in.nextLine().strip();

        // find the suffix
        String[] names = input.split(",");
        if(names.length > 1)
        {
            suffix = names[1].strip();
        }

        // find the other parts of the name
        String name = names[0].strip();
        String[] nameParts = name.split(" ");
        firstName = nameParts[0].strip();
        if(nameParts.length > 2)
        {
            middleName = nameParts[1].strip();
            lastName = nameParts[2].strip();
        }
        else
        {
            lastName = nameParts[nameParts.length - 1].strip();
        }

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Suffix: " + suffix);
    }
}
