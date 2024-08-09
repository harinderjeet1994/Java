public class SumCalculator {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12,23));
    }

        public static boolean getEvenDigitSum(int num1, int num2){
            if((num1 < 10) && (num2 > 99)){
                return false;
            }

            while ((num1 > 10) || (num2 < 99)){
                int digit = num1 % 10;
                int digit2 = num2 % 10;
                int digit3 = 

                if ((digit == digit2)){
                    return true;
                }
                num1 /= 10;

            }
            return false; }

    }



/*if ((num1 >= 10 && num1 <=99) && (num2 >= 10 && num2 <= 99)){
        int Num1 = num1 % 10;
        int NumA = num1 / 10;
        int Num2 = num2 % 10;
        int NumB = num2 / 10;
        if ((Num1 == Num2) || (NumA == NumB) || (Num1 == NumB)){
        return true;
        }

        }
        return false; }*/

