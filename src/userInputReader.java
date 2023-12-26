import java.util.Scanner;

public class userInputReader {
    public static void main(String[] args) {

       int sum = userInput();

       System.out.println("Total is " + sum);
    }

    public static int userInput() {

        int sum = 0;
        int count = 1;
        boolean valid = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input 5 valid number");

        try{
            do {
                System.out.println("Enter number #" + count);
                int addedNumber = Integer.parseInt(sc.nextLine());

                sum += addedNumber;
                count++;

                if(count == 6) valid = true;
            }while (!valid);

        }catch (NumberFormatException e){
            System.out.println("Please input a valid number");
        }


        return sum;
    }
}
