package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2;

        System.out.println("Please enter the cell phone information: ");
        System.out.print("  What is the serial number? ");
        cellPhone1.setSerialNumber(in.nextInt());
        in.nextLine();
        System.out.print("  What is the model? ");
        cellPhone1.setModel(in.nextLine());
        System.out.print("  What is the carrier? ");
        cellPhone1.setCarrier(in.nextLine());
        System.out.print("  What is the phone number? ");
        cellPhone1.setNumber(in.nextLine());
        System.out.print("  Who is the owner? ");
        cellPhone1.setOwner(in.nextLine());

        cellPhone2 = new CellPhone(123456789, "iPhone 12", "AT&T", "555-555-5555", "John Doe");

        display(cellPhone1);
        display(cellPhone2);

        System.out.println();

        cellPhone1.dial(cellPhone2);
        cellPhone2.dial(cellPhone1);




    }

    public static void display(CellPhone phone)
    {
        System.out.println();
        System.out.println(phone.getOwner() + "'s phone information: ");
        System.out.println("-------------------------------------------");
        System.out.println("  Serial Number: " + phone.getSerialNumber());
        System.out.println("  Model: " + phone.getModel());
        System.out.println("  Carrier: " + phone.getCarrier());
        System.out.println("  Phone Number: " + phone.getNumber());
        System.out.println();
    }
}