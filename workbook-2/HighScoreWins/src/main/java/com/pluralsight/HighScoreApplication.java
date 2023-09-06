package com.pluralsight;

import java.util.Scanner;

public class HighScoreApplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a full score: ");
        String input = in.nextLine();

        String[] parts = input.split("\\|");
        String[] teamParts = parts[0].split(":");
        String[] scoreParts = parts[1].split(":");


        String team1 = teamParts[0];
        String team2 = teamParts[1];
        int score1 = Integer.parseInt(scoreParts[0]);
        int score2 = Integer.parseInt(scoreParts[1]);

        if (score1 > score2)
        {
            System.out.println(team1 + " beat " + team2);
            System.out.println(score1 + " to " + score2);
        }
        else if (score1 < score2)
        {
            System.out.println(team2 + " beat " + team1);
            System.out.println(score2 + " to " + score1);
        }
        else
        {
            System.out.println("Tie");
        }

    }
}
