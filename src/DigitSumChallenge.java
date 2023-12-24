public class DigitSumChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int listNumber = 1110;

       System.out.println("The sum of your digits is " + digitsSum(1110));
    }

    public static int digitsSum(int listNum) {
        if (listNum < 0) return -1;

        int sum = 0;

        while (listNum > 9) {
         sum += (listNum % 10);

         listNum = listNum / 10;
        }

        sum += listNum;

        return sum;
    }
}
