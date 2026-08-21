import java.util.Scanner;

class AgeChecker {

    public void checkAgeCategory(int n) {
        if (n >= 60)
            System.out.println("Senior Citizen");
        else if (n >= 18)
            System.out.println("Adult");
        else
            System.out.println("Minor");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = sc.nextInt();

        AgeChecker obj = new AgeChecker();
        obj.checkAgeCategory(age);

        sc.close();
    }
}