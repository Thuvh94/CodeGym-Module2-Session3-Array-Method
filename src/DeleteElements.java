import java.util.Scanner;
public class DeleteElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the element you want to delete: ");
        int inputNumber = input.nextInt();

        int[] arr = {1,5,7,8,0,2,3,4,15,62};
        System.out.println("Before delete " + printArray(arr));

        int indexDeleteElement = findIndex(arr,inputNumber);

        if (indexDeleteElement >= 0){
            System.out.println(inputNumber + " is at position " + (indexDeleteElement+1) + " in this array");
            int[] afterDelete =  delete(arr,indexDeleteElement);
            System.out.println("After delete " + printArray(afterDelete));
        }
        else
            System.out.println(inputNumber + " is not in this array");
    }

    public static int findIndex(int[] array,int number){
        boolean check = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]){
                check = true;
                index = i;
                break;
            }
            check = false;
        }

       if (check)
           return index;
       else{
           return index = -1;
       }
    }

    public static int[] delete(int[] array,int index){
        if (index == array.length-1) {
            array[array.length-1] = 0;
            return array;
        }
        else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i+1];
                array[array.length-1] = 0;
            }
            return array;
        }
    }

    public static String printArray(int []array){
        String str= "";
        for (int x: array){
            str+= x +" ";
        }
        return str;
    }
}
