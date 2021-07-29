public class PrimeNumRange {

    /**
     * Take a range and print prime numbers from that range.
     * @author Chaitra NS
     * @since 28 July 2021
     */

    public static void main(String[] args) {
        int num = 0;
        while (num <= 1000){
            int i = 2;
            int count = 0;
            while(i<=num/2){
                if(num%i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && num!=0 && num!=1){
                System.out.print(num +" ");
            }
            num++;
        }
    }
}