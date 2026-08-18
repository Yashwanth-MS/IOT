import java.util.Scanner;

public class EmployeeManagementSimple {

    static String name;
    static int age;
    static String designation;
    static double salary;
    static boolean employeeExists = false;

    static Scanner sc = new Scanner(System.in);

    static boolean exitProgram = false;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    raiseSalary();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (!exitProgram);
    }

    // Case 4: Exit
    static void exit() {
        System.out.print("Are you sure you want to exit? (yes/no): ");
        String confirm = sc.nextLine().trim();

        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Exiting program. Goodbye!");
            exitProgram = true;
        } else {
            System.out.println("Okay, returning to menu.");
        }
    }

    // Case 1: Create employee
    static void create() {
        String again;
        do {
            System.out.print("Enter name: ");
            name = sc.nextLine();

            System.out.print("Enter age: ");
            age = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Enter designation (programmer/manager/tester): ");
            designation = sc.nextLine();

            if (designation.equalsIgnoreCase("manager")) {
                salary = 50000;
            } else if (designation.equalsIgnoreCase("programmer")) {
                salary = 35000;
            } else if (designation.equalsIgnoreCase("tester")) {
                salary = 25000;
            } else {
                salary = 20000;
            }

            employeeExists = true;
            System.out.println(name + " added with base salary " + salary);

            System.out.print("Add another person? (yes/no): ");
            again = sc.nextLine();

        } while (again.equalsIgnoreCase("yes"));
    }

    // Case 2: Display employee
    static void display() {
        if (!employeeExists) {
            System.out.println("No employee created yet.");
            return;
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    // Case 3: Raise salary
    static void raiseSalary() {
        if (!employeeExists) {
            System.out.println("No employee created yet.");
            return;
        }
        System.out.print("Enter raise percentage (e.g. 10 for 10%): ");
        double percent = Double.parseDouble(sc.nextLine().trim());
        salary = salary + (salary * percent / 100);
        System.out.println("New salary of " + name + " is " + salary);
    }
}
