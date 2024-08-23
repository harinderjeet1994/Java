public class MultiDimensionArray {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
        arr [0][0] = 10;
        arr [0][1] = 20;
        arr [0][2] = 30;
        arr [1][0] = 20;
        arr [1][1] = 30;
        arr [1][2] = 10;
        arr [2][0] = 20;
        arr [2][1] = 30;
        arr [2][2] = 10;
        int [][] array = new int[3][3];
        array[0][0] = 20;
        array[0][1] = 10;
        array[0][2] = 30;
        array[1][0] = 10;
        array[1][1] = 25;
        array[1][2] = 25;
        array[2][0] = 50;
        array[2][1] = 20;
        array[2][2] = 25;

        System.out.println("First Array: ");

        for (int i = 0; i < arr.length ; i++ ){
            for (int j = 0; j < arr[i].length  ; j++ ){
                System.out.print(arr[i][j] + " "  );

            }
        }
        System.out.println("\n" + "Second Array: ");
        for (int i = 0;i < array.length ; i++ ){
            for (int j = 0; j < array[i].length  ; j++ ){
               System.out.print(array[i][j] + " " );
            }

    }
        int[][] result = new int[3][3];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j] + array[i][j];
            }
        }


        System.out.println("\n" + "Sum of two Arrays:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }

        }
    }}