package com.ControlStatement;

import java.util.Scanner;

public class Stud_Details {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String name = s.nextLine();
        
        if (name.equals("Aditya") || name.equals("Lonewolf")) {
            System.out.print("Please enter your password: ");
            String password = s.nextLine();
            if (password.equals("Kuchbhi")) {
                System.out.println("Log in successfully.");
            } else {
                System.out.println("Log in failed.");
            }
        } else if (name.equals("Aman")) {
            System.out.print("Please enter your password: ");
            String password = s.nextLine();
            if (password.equals("password")) {
                System.out.println("Log in successfully.");
            } else {
                System.out.println("Log in failed.");
            }
        } else {
            System.out.println("Enter valid username.");
        }
        
        s.close();
    }
}
