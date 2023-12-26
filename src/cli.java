import java.util.Scanner;

public class cli {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            getInputFromTerminal(currentYear);
        }catch (NullPointerException e){
            getInputFromIDE(currentYear);
        }
    }

    public static String getInputFromTerminal(int currentYear) {

        String name = System.console().readLine("Hi, what's your Name? ");
        System.out.println("Hi " + name + ", thanks for taking the course!");

        String age = System.console().readLine("Which year were born? ");
        int usersAge = currentYear - Integer.parseInt(age);

        System.out.println("Your current age is " + usersAge);


        return "";
    }

    public static String getInputFromIDE(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter the with >= " + (currentYear - 125) + " and <= " + (currentYear));

            try {
                age = checkData(currentYear, scanner.nextLine());

                validDOB = age < 0 ? false : true;

            }catch (NumberFormatException e){
                System.out.println("Kindly write a real number");
            }

        }while (!validDOB);

        System.out.println("Hi, " + name + ", aged " + age + " old");
        System.out.println("Hello world");

        return "";
    }

    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);

        int validYear = currentYear - 125;

        if(validYear > dob && dob < currentYear){
            return -1;
        }


        return currentYear - dob;
    }
}
