public class challenge2a {
    public static void main(String[] args) {
     /* Sum of digit given */
     int digits = 1234;
     int sum = digitSum(digits);

     System.out.println(sum);
    }

    public static int digitSum(int d){
        if (d < 0) return -1;

        int sum = 0;

        while (d > 9){
            sum += (d % 10);

            d = d / 10;
        }

        sum += d;

        return sum;
    }
}
