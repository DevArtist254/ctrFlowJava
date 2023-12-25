public class challenge1a {
    public static void main(String[] args) {


        for (int wholeNumber = 0;wholeNumber <= 50; wholeNumber++){

            if (!isPrimeNumber(wholeNumber)) continue;

            System.out.println(wholeNumber + " is "+ (isPrimeNumber(wholeNumber) ? "" : "not") + " a prime number");
        }
    }

    public static boolean isPrimeNumber(int wholeNumber){
        //Checking for numbers less than 2
        if(wholeNumber < 2) return  (wholeNumber == 2);

        for (int i = 2;i < wholeNumber; i++){

            if((wholeNumber % i) == 0) return false;
        }

        return true;
    }
}
