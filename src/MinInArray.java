public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 12, 34, 55, 3, 8};
        int index = minValue(arr);
        System.out.println("Min element in this array is " + arr[index]);
    }

    public static int minValue(int[] array) {
        int tempMin = array[0];
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (tempMin > array[i]) {
                tempMin = array[i];
                position = i;
            }
        }
        return position;
    }
}
