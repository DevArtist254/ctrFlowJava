public class challenge2 {
    public static void main(String[] args) {

        int count = 0;

        for (int wholeNumber = 0;wholeNumber <= 20; wholeNumber++){

            if (isPrime(wholeNumber)) count++;

            System.out.println(wholeNumber+" is "+(isPrime(wholeNumber) ? "" : "NOT")+" a prime number");

            if (count == 3) break;
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if(wholeNumber < 2) return (wholeNumber == 2);


        for(int i = 2;i < wholeNumber; i++ ){

            if (wholeNumber % i == 0) return false;
        }

        return true;
    }
}
