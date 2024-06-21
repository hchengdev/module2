public class MyQueueP3 {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currenSize;

    public MyQueueP3(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        return currenSize == capacity;
    }

    public boolean isEmpty() {
        return currenSize == 0;
    }

    public void enqueue(int data) {
        if(isQueueFull()) {
            System.out.println("Queue is full");
        } else {
            queueArr[tail] = data;
            tail = (tail + 1) % capacity;
            currenSize++;
            System.out.println("Element " + data + " is pushed to Queue!");
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int element = queueArr[head];
            head = (head + 1) % capacity;
            currenSize--;
            System.out.println("Element " + element + " is popped from Queue!");
        }
    }
}
