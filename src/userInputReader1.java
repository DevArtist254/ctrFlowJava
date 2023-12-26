import java.util.Scanner;

public class userInputReader1 {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, whats your name");
        String name = sc.nextLine();

        System.out.println("Good morning " + name);

        //1a. Get input 5 from user
        System.out.println("Please enter 5 numbers you would like summed up");

        //2a. Read and check for errors
        do{
            System.out.println("Number "+ count +".#");

            try {

                int num = Integer.parseInt(sc.nextLine());

                sum += num;
                count++;

            }catch (NumberFormatException e){

                //3a. Return the upgrade error
                System.out.println("Kindly input a integer");

            }
        }while (count <= 5);

        System.out.println("Total is "+ sum);
    }
}
