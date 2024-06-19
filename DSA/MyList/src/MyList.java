public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];
    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        if (size == element.length) {
            int newSize = DEFAULT_CAPACITY * 2;
            Object[] newArray = new Object[newSize];        }
    }

    public void add(E e) {
           ensureCapa();
           element[size++] = e;
    }

    public E getElement(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) element[index];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(element[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
