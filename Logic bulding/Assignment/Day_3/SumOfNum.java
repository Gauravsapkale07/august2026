import java.util.Scanner;

class SumOfNum {

    public static int calculateSum(int num) {

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int res = calculateSum(n);

        System.out.println("Total Sum = " + res);
    }
}