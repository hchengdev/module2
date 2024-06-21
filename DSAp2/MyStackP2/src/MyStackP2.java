public class MyStackP2 {
    private int[] arr;
    private int size;
    private int index = 0;
    public MyStackP2(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        arr[index] = x;
        index++;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        return arr[index--];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == size;
    }

    public int size() {
        return index;
    }

}
