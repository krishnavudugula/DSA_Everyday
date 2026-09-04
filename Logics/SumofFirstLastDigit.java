public class SumofFirstLastDigit {
    public static void main(String[] args) {
        int num = 9876;
        int last = num % 10;
        int first = num;
        while (first>=10){
            first /= 10;
        }
        System.out.println(first + last);
        
    }
}
