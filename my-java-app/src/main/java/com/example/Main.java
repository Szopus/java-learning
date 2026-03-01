package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("👋 Welcome to Ashenmoor Escape!");
        System.out.println("Type 'exit' to quit the game.\n");
        
        // Pętla działa dopóki użytkownik nie wpisze "exit"
        do {
            System.out.print("Enter your name: ");
            input = scanner.nextLine().trim();
            
            // Sprawdź czy użytkownik chce wyjść
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("🚪 Goodbye! Thanks for playing.");
                break;
            }
            
            // Personalizowane powitanie
            if (!input.isEmpty()) {
                System.out.println("✨ Hello, " + input + "! Ready for an adventure?\n");
            } else {
                System.out.println("⚠️  Please enter a valid name.\n");
            }
            
        } while (!input.equalsIgnoreCase("exit"));
        
        scanner.close();
    }
}