import java.util.*;

public class ApplesnOranges {
public static void countApplesAndOranges(
        int s, int t, int a, int b,
        List<Integer> apples, List<Integer> oranges) {

    int appleCount = 0;
    int orangeCount = 0;

    // Check apples
    for (int apple : apples) {
        int position = a + apple;

        if (position >= s && position <= t) {
            appleCount++;
        }
    }

    // Check oranges
    for (int orange : oranges) {
        int position = b + orange;

        if (position >= s && position <= t) {
            orangeCount++;
        }
    }

    System.out.println(appleCount);
    System.out.println(orangeCount);
}
}