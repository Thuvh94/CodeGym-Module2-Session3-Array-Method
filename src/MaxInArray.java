import java.util.Scanner;
public class MaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        // Check valid size
        do{
            System.out.println("Insert size of array: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        }
        while (size > 20);

        //Insert array elements
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Insert element " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }
        //Print array out
        System.out.println("Property list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
        }
        //Find max and its position
        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
