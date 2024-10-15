import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleCounter {

    public static int[] countMultiples(List<Integer> numbers) {
        int[] multiplesCount = new int[9];

        for (int number : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    multiplesCount[i - 1]++;
                }
            }
        }
        
        return multiplesCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers separated by commas: ");
        String input = sc.nextLine();
        String[] inputArray = input.split(",");
        List<Integer> numbers = new ArrayList<>();
        
        for (String num : inputArray) {
            numbers.add(Integer.parseInt(num.trim()));
        }

        int[] result = countMultiples(numbers);
        System.out.print("{");
        for (int i = 0; i < result.length; i++) {
            System.out.print((i + 1) + ": " + result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        sc.close();
    }
}
