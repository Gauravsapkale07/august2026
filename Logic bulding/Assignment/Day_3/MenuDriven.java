import java.util.Scanner;

class MenuDriven {

    public static void grade() {

        int marks = 85;

        if (marks >= 90)
            System.out.println("Average marks: " + marks + "\nGrade: A");
        else if (marks >= 70)
            System.out.println("Average marks: " + marks + "\nGrade: B");
        else if (marks >= 50)
            System.out.println("Average marks: " + marks + "\nGrade: C");
        else if (marks >= 30)
            System.out.println("Average marks: " + marks + "\nGrade: D");
        else
            System.out.println("Average marks: " + marks + "\nGrade: Fail");
    }


    public static void leap() {

        int year = 2003;

        if ((year % 400 == 0) ||
            (year % 4 == 0 && year % 100 != 0)) {

            System.out.println(year + " is a leap year");

        } else {

            System.out.println(year + " is not a leap year");
        }
    }


    public static void dayofweek() {

        int day = 1;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }


    public static void varValues() {

        byte a = 0;
        short b = 0;
        int c = 0;
        long d = 0L;
        float e = 0.0f;
        double f = 0.0;
        char g = '\u0000';
        boolean h = false;

        System.out.println("byte = " + a);
        System.out.println("short = " + b);
        System.out.println("int = " + c);
        System.out.println("long = " + d);
        System.out.println("float = " + e);
        System.out.println("double = " + f);
        System.out.println("char = " + g);
        System.out.println("boolean = " + h);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;

        while (i != 0) {

            System.out.println(
                "\nSelect Operation (1,2,3,4,5)" +
                "\nProblem 1: Grade Evaluation System" +
                "\nProblem 2: Leap Year Check" +
                "\nProblem 3: Day of the Week" +
                "\nProblem 4: Identify Default Values of Variables" +
                "\nCase 5: Exit"
            );

            System.out.println(
                "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"
            );

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    grade();
                    break;

                case 2:
                    leap();
                    break;

                case 3:
                    dayofweek();
                    break;

                case 4:
                    varValues();
                    break;

                case 5:
                    System.out.println("Thank you! Visit again!");
                    i = 0;
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }

        sc.close();
    }
}