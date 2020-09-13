import java.util.Scanner;
public class SumInDiagonal2DArray {
    public static void main(String[] args) {
        System.out.println("Insert size of the square matrix");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Insert element ["+i+"][" + j +"]");
                array[i][j] = scanner.nextInt();
            }
        }
        String str = "";
        for(int[] x : array){
            str += "[";
            for(int y: x){
                str += y +",";
            }
            str +="]";
        }
        System.out.println(str);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        System.out.println("Sum in diagonal of square matrix is "+sum);
    }
}
