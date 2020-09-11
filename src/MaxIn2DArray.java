public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1,3,20,7,9},
                {2,4,6,8},
        };
        int max=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max )
                    max = array[i][j];
            }
        }
        System.out.println("Max value is " + max);
    }
}
