/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.lectureroommanager1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LectureRoomManager1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LectureRoom room = new LectureRoom();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("W - Add Students");
            System.out.println("X - Remove Students");
            System.out.println("Y - Turn On Light");
            System.out.println("Z - Turn Off Light");
            System.out.println("Q - Quit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "W":
                    System.out.print("Enter number of students to add: ");
                    int addCount = Integer.parseInt(scanner.nextLine());
                    room.addStudents(addCount);
                    break;

                case "X":
                    System.out.print("Enter number of students to remove: ");
                    int removeCount = Integer.parseInt(scanner.nextLine());
                    room.removeStudents(removeCount);
                    break;

                case "Y":
                    System.out.print("Enter light number to turn on (1, 2, 3): ");
                    int lightOn = Integer.parseInt(scanner.nextLine());
                    room.turnOnLight(lightOn);
                    break;

                case "Z":
                    System.out.print("Enter light number to turn off (1, 2, 3): ");
                    int lightOff = Integer.parseInt(scanner.nextLine());
                    room.turnOffLight(lightOff);
                    break;

                case "Q":
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            room.displayStatus();
        }
    }
}


