public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        if (number < 1) {
            return false;
        }

        int factor = 1;
        int sum = 0;

        while (number > factor){
            if (number % factor == 0){
                sum = sum + factor;
            }
            factor += 1;
        }
        return  (sum == number);
    }
}
