public class SwapNumbers {

    public static void main(String[] args)
    {
       String companyName = "pragra";
        System.out.println(companyName);
       char[] chars = companyName.toCharArray();


        for (int i = 0; i < (chars.length) / 2; i++){
            char temp = chars[i];
           chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
            System.out.println(" ");
        }
        System.out.println("Reversed Company Name: ");
        for (int element : chars
             ) {
            System.out.print(element + " ");

        }



    }




        }





