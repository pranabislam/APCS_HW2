import java.lang.Integer;

public class Driver {
    public static void main(String[] args) {
        /*
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
        */

        ArrayQueue2<Integer> q2 = new ArrayQueue2<Integer>(10);
        System.out.println(q2.empty());
        for (int i = 0 ; i < 10 ; i++) {
            q2.enqueue(i);
        }
        System.out.println(q2.empty());

        System.out.println(q2);
        System.out.println(q2.head());
        System.out.println(q2.dequeue());
        System.out.println(q2);
    }
}
