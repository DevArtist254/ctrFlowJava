public class switchSS {
    public static void main(String[] args) {
        int value = 2;

//        if (value == 1) {
//            System.out.println("Was 1");
//        } else if (value == 2) {
//            System.out.println("Was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }

        switch (value) {
            case 1:
                System.out.println("Was 1");
                break;
            case 2:
                System.out.println("Was 2");
                break;
            default:
                System.out.println("Was 1 not 2");
        }

        System.out.println("JAN is in the "+ getQuarter("JAN") +" quarter of the year");
    }

    public static String getQuarter(String month) {

        return switch (month){
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> "Entry is bad";
        };
    }

}
