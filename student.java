// Design a class named Student that has two private data – student id and score. The 
// class should contain a parameterized constructor to initialize its data member and one 
// method to display the information. Now write a Java program that will use an array of 
// Student objects to represent information about 3 students. Your program should take 
// input from the keyboard and display the information of the 3 students.

import java.util.*;

class student {
    private int id, score;

    public String name;

    // Defining the constructor
    public student(String name, int id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    void display() {
        // Printing out all the information
        System.out.println("\nStudent Name: " + name + "\nId: " + id + "\nScore: " + score);

    }
}

class Examplestudent {
    public static void main(String[] args) {
        // Declaring an Array
        student[] arr = new student[3];

        // Taking input from user
        try (Scanner sc = new Scanner(System.in)) {
            // Declearing Variables
            String name;
            int id, score;

            // Taking user input for 3 students
            for (int i = 0; i < 3; i++) {
                System.out.print("\nEnter the name: ");
                name = sc.next();
                System.out.print("Enter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the score: ");
                score = sc.nextInt();
                arr[i] = new student(name, id, score);
            }

        }
        System.out.println("\n\n\nStudents information: ");

        // Displaying the Students information
        for (student student : arr) {
            student.display();
        }
    }

}