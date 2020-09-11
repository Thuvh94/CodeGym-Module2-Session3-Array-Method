import jdk.swing.interop.SwingInterOpUtils;

import  java.util.Scanner;
public class AddElements {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Insert size of array: ");
        size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Insert element " + (i+1) +":");
            int number = input.nextInt();
            array[i] = number;
        }
        String arrString = "";
        for (int x: array){
            arrString += x +" ";
        }
        System.out.println("Your array: " + arrString);

        System.out.println("Which number do you want to add to this array? ");
        int inputNum = input.nextInt();

        System.out.println("Where do you want to add number? ");
        int inputIndex = input.nextInt();

        if (inputIndex < 1 || inputIndex > array.length ){
            System.out.println("Can not add your number to array");
        }
        else {
            int[] afterAddedArray = addElement(array,inputNum,inputIndex);
            arrString = "";
            for (int x: afterAddedArray){
                arrString += x + " ";
        }
            System.out.println("After added array: "+ arrString);
        }

    }
    public static int[] addElement(int[] array, int num, int index){
        int[] newArray = new int[array.length+1];
        for (int i = 0,j=0; i < index-1; i++) {
            newArray[i] = array[i];
        }
        newArray[index-1] = num;
        for (int j = index; j < newArray.length; j++) {
            newArray[j] = array[j-1];
        }
        return newArray;
    }
}
