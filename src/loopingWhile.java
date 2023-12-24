public class loopingWhile {
    public static void main(String[] args) {
        int j = 0;

        while (j <= 5){
            System.out.println(j);
            j++;
        }

        int k = 0;
        boolean isReady = false;

        do {
            if (k > 5) break;

            System.out.println(k);

            k++;
            isReady = (k > 0);
        }while (isReady);
    }
}
