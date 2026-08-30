import java.util.*;
public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int perfectNumber = 0;

        for(int i =1; i<num; i++){
            if(num % i == 0){
                perfectNumber += i;
            }
        }
        System.out.println(((perfectNumber == num && num > 0) ? "Perfect Number" : "Not a Perfect Number") + ": "+ perfectNumber );
    }
}
