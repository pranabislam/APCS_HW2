import java.lang.Integer;

public class Driver {
    public static void main(String[] args) {
        myQueue<Integer> q1 = new myQueue<Integer>();
        System.out.println(q1.empty());
        for (int i = 0 ; i < 10 ; i++) {
            q1.enqueue(i);
        }
        System.out.println(q1.empty());

        System.out.println(q1);
        System.out.println(q1.head());
        System.out.println(q1.dequeue());
        System.out.println(q1);
    }
}
