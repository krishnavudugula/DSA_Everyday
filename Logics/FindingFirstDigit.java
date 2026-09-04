public class FindingFirstDigit {
    public static void main(String[] args) {
        int num = 9876;
        while (num >= 10){
            num = num / 10;
        }
        System.out.println(num);
    }
}
