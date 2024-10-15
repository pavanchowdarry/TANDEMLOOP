import java.util.Scanner;

public class OddNumberSeries {

    public static void generateSeries(int a) {
        int oddNumber = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(oddNumber);
            if (i < a) {
                System.out.print(", ");
            }
            oddNumber += 2;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        generateSeries(a);
        sc.close();
    }
}
