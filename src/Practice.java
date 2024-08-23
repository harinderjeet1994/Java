import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of array");
        int n = scanner.nextInt();
        System.out.println("Input array values");
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Element: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            System.out.println("Array of length " + i + ": " + array[i]);
            int max = array[0];

            if (max < array[i]){
                max = array[i];
            }
            System.out.println(max);}

            int[] arr = new int[array.length];
            for (int i = 0; i < array.length; i++){
                System.out.println(array[i]);

            }

        }
}

       /* for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];

            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        System.out.println(Arrays.toString(array));





        }*/









