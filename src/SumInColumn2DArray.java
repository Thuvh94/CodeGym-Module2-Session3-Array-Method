import java.util.Scanner;

public class SumInColumn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        System.out.println("Which column do you want to sum?");
        Scanner scanner = new Scanner(System.in);
        int inputColumn = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][inputColumn - 1];
        }
        System.out.println("Sum of numbers in your chosen column is " + sum);
    }

}

