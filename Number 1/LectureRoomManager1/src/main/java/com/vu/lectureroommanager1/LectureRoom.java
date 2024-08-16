/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vu.lectureroommanager1;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class LectureRoom {
    


    private int studentCount;
    private boolean[] lights; // Represents lights 1, 2, and 3

    public LectureRoom() {
        this.studentCount = 0;
        this.lights = new boolean[3]; // Initialize lights to off
    }

    public void addStudents(int count) {
        if (count < 0) {
            System.out.println("Cannot add a negative number of students.");
            return;
        }
        studentCount += count;
        System.out.println(count + " students added. Total students: " + studentCount);
    }

    public void removeStudents(int count) {
        if (count < 0) {
            System.out.println("Cannot remove a negative number of students.");
            return;
        }
        studentCount = Math.max(0, studentCount - count);
        System.out.println(count + " students removed. Total students: " + studentCount);
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            System.out.println("Invalid light number. Please choose 1, 2, or 3.");
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number. Please choose 1, 2, or 3.");
        }
    }

    public void displayStatus() {
        System.out.println("Total students in the room: " + studentCount);
        System.out.print("Lights status: ");
        for (int i = 0; i < lights.length; i++) {
            System.out.print("Light " + (i + 1) + ": " + (lights[i] ? "On" : "Off") + " | ");
        }
        System.out.println();
    }
}
