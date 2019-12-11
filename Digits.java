public class Digits{

    private int[] digitList;

    public Digits(int num){
        digitList = new int[numberOfDigits(num)];
        int mod = 10 * numberOfDigits(num);
        for (int i = 0; i < numberOfDigits(num); i++){
            digitList[i] = num % mod;
            mod/10;
        }
    }

    public int numberOfDigits(int num){
        int digitCount = 0;
        while (num>0){
            num/10;
            digitCount++;
        }
    }
}