/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vu.lectureroom;

/**
 *
 * @author HP
 */

    import java.util.Scanner;

public class LectureRoomManager {
    public static void main(String[] args) {
        LectureRoom room = new LectureRoom();
        Scanner scanner = new Scanner(System.in);
        

        while (true) {
            System.out.println("\nLecture Room Control Menu:");
            System.out.println("W - Add students");
            System.out.println("X - Remove students");
            System.out.println("Y - Turn on light");
            System.out.println("Z - Turn off light");
            System.out.println("S - Show room status");
            System.out.println("C - Clean the room");
            System.out.println("A - Adjust temperature");
            System.out.println("Q - Quit");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "W":
                    System.out.print("Enter number of students to add: ");
                    int addNum = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < addNum; i++) {
//                        room.enter();
                    }
                    System.out.println(addNum + " students added.");
                    break;

                case "X":
                    System.out.print("Enter number of students to remove: ");
                    int removeNum = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < removeNum; i++) {
//                        room.exit();
                    }
                    System.out.println(removeNum + " students removed (or as many as possible).");
                    break;

                case "Y":
                    System.out.print("Enter light number to turn on (1, 2, or 3): ");
                    int lightOn = Integer.parseInt(scanner.nextLine());
                    if (lightOn >= 1 && lightOn <= 3) {
//                        room.lighton(lightOn);
                        System.out.println("Light " + lightOn + " turned on.");
                    } else {
                        System.out.println("Invalid light number. Please choose 1, 2, or 3.");
                    }
                    break;

                case "Z":
                    System.out.print("Enter light number to turn off (1, 2, or 3): ");
                    int lightOff = Integer.parseInt(scanner.nextLine());
                    if (lightOff >= 1 && lightOff <= 3) {
//                        room.lightoff(lightOff);
                        System.out.println("Light " + lightOff + " turned off.");
                    } else {
                        System.out.println("Invalid light number. Please choose 1, 2, or 3.");
                    }
                    break;

                case "S":
                    System.out.println(room.toString());
                    break;

                case "C":
//                    room.clean();
                    System.out.println("Room has been cleaned.");
                    break;

                case "A":
                    System.out.print("Enter desired temperature: ");
                    double temp = Double.parseDouble(scanner.nextLine());
//                    room.setTemperature(temp);
                    System.out.println("Temperature set to " + temp + "°C.");
                    break;

                case "Q":
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

