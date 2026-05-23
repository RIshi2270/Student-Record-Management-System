import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class Main
{
    static ArrayList<Student> students = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    static void addStudent()
    {
        System.out.print("\nEnter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Student Name: ");
        String name = sc.next();

        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();

        Student s = new Student(id, name, marks);

        students.add(s);

        System.out.println("\nStudent Added Successfully!");
    }

    static void viewStudents()
    {
        if(students.size() == 0)
        {
            System.out.println("\nNo Student Records Found!");
            return;
        }

        System.out.println("\n===== STUDENT RECORDS =====");

        for(Student s : students)
        {
            System.out.println("\nStudent ID: " + s.id);
            System.out.println("Student Name: " + s.name);
            System.out.println("Student Marks: " + s.marks);
        }
    }

    static void searchStudent()
    {
        System.out.print("\nEnter Student ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for(Student s : students)
        {
            if(s.id == searchId)
            {
                System.out.println("\n===== STUDENT FOUND =====");

                System.out.println("Student ID: " + s.id);
                System.out.println("Student Name: " + s.name);
                System.out.println("Student Marks: " + s.marks);

                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("\nStudent Not Found!");
        }
    }

    static void deleteStudent()
    {
        System.out.print("\nEnter Student ID to Delete: ");
        int deleteId = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).id == deleteId)
            {
                students.remove(i);

                found = true;

                System.out.println("\nStudent Deleted Successfully!");

                break;
            }
        }

        if(found == false)
        {
            System.out.println("\nStudent Not Found!");
        }
    }

    public static void main(String[] args)
    {
        int choice;

        while(true)
        {
            System.out.println("\n===== STUDENT RECORD MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("\nEnter Your Choice: ");

            choice = sc.nextInt();

            if(choice == 1)
            {
                addStudent();
            }
            else if(choice == 2)
            {
                viewStudents();
            }
            else if(choice == 3)
            {
                searchStudent();
            }
            else if(choice == 4)
            {
                deleteStudent();
            }
            else if(choice == 5)
            {
                System.out.println("\nProgram Exited");
                break;
            }
            else
            {
                System.out.println("\nInvalid Choice!");
            }
        }
    }
}