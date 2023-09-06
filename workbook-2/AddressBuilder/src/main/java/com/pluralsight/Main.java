package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        StringBuilder addressBuilder = new StringBuilder();

        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");
        addressBuilder.append(in.nextLine().strip()).append("\n\n");

        System.out.println();
        addressBuilder.append("Billing Address: \n");
        System.out.print("Billing Street: ");
        addressBuilder.append(in.nextLine().strip()).append("\n");
        System.out.print("Billing City: ");
        addressBuilder.append(in.nextLine().strip()).append(", ");
        System.out.print("Billing State: ");
        addressBuilder.append(in.nextLine().strip()).append(" ");
        System.out.print("Billing Zip: ");
        addressBuilder.append(in.nextLine().strip()).append("\n\n");

        System.out.println();
        addressBuilder.append("Shipping Address: \n");
        System.out.print("Shipping Street: ");
        addressBuilder.append(in.nextLine().strip()).append("\n");
        System.out.print("Shipping City: ");
        addressBuilder.append(in.nextLine().strip()).append(", ");
        System.out.print("Shipping State: ");
        addressBuilder.append(in.nextLine().strip()).append(" ");
        System.out.print("Shipping Zip: ");
        addressBuilder.append(in.nextLine().strip());

        System.out.println();
        System.out.println(addressBuilder);
    }
}