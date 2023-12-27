import java.util.Scanner;

public class minMaxInputReader1 {
    public static void main(String[] args) {

        int min = 0;
        int max = 0;
        String entry = "";
        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        do{
            try {
                System.out.println("Please enter a number or letter c to quit");
                System.out.println("Max :"+ max);
                System.out.println("Min :"+ min);

                entry = sc.nextLine();

                int num = Integer.parseInt(entry);

                if(min > num || min == 0) {
                    min = num;
                }

                if(max < num || max == 0) {
                    max = num;
                }


            }catch (NumberFormatException e){
                if (entry.contains("c")) quit = true;
                System.out.println("Please enter a valid integer, or letter c to quit");
            }
        }while (!quit);
    }
}
