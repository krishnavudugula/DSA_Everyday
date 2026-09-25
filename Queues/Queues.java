import java.util.*;;
public class Queues {
    public static void main(String[] args) {
        
        Queue<Integer> q1 = new PriorityQueue<>();
        
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);

        System.out.println(q1);

        q1.poll();
        System.out.println(q1);

        
        System.out.println(q1.peek());

        System.out.println(q1.size());
        
    }
}