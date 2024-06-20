public class MyQueues {
    public Node rear;
    public Node front;

    public MyQueues() {
        rear = null;
        front = null;
    }
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            newNode.next = front;
        }
        else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }
    public Node deQueue() {
        if (front == null) {
            return null;
        }else if (front == rear) {
            Node temp = front;
            front = rear = null;
            return temp;
        }else {
            Node temp = front;
            front = front.next;
            rear.next = front;
            return temp;
        }

    }
    public boolean isEmpty() {
        return front == null;
    }

    public Node peek() {
        return front;
    }

}
