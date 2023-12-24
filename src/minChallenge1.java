public class minChallenge1 {
    public static void main(String[] args) {

        for (double rate = 7.5;rate <= 10.0; rate += 0.25){

            double amount = 100000.00;

            if (rate > 8.5) break;

            System.out.println("the rate "+ amount +" $ is "+ calcInter(amount, rate) +" $ at "+ rate +" %");
        }
    }
    public static double calcInter(double amount, double rate){
        return (amount * (rate / 100));
    }
}
