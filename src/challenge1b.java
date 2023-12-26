public class challenge1b {
    public static void main(String[] args) {

        for (int c = 0;c <= 1000; c++){

            if(!isPrimeNum(c)) continue;

            System.out.println(c + " is "+ (isPrimeNum(c) ? "" : "Not" ) +" a prime number");
        }
    }

    public static boolean isPrimeNum(int wholeNumber){
        if (wholeNumber < 2) return (wholeNumber == 2);

        //Range from 2 - < wholeNumber;

        for(int i = 2;i < wholeNumber; i++){

            if((wholeNumber % i) == 0) return false;
        }

        return true;
    }
}
