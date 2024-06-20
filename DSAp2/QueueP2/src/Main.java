//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyQueues queue = new MyQueues();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        System.out.println("Front element: " + (queue.peek() != null ? queue.peek().data : "null"));

        System.out.println(queue.deQueue());

        System.out.println("Front element after dequeue: " + (queue.peek() != null ? queue.peek().data : "null"));

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println(queue.deQueue());


        System.out.println("Is queue empty after dequeuing all elements? " + queue.isEmpty());

    }
}