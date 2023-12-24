public class challenge3 {
    public static void main(String[] args) {
        int num = 5;
        int count = 0;
        int sum = 0;

        while (num <= 20) {
            num++;

            if (!isEvenNumber(num)) continue;

            sum += num;

            System.out.println(num + " even number");

            count++;

            if (count == 5) break;
        };

        System.out.println("Total sum is " + sum);
    }

    public static boolean isEvenNumber (int num){
        return num % 2 == 0;
    }
}
