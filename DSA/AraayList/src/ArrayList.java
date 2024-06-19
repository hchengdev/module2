import java.util.Arrays;

public class ArrayList<E> implements Cloneable {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        if (size == elements.length) {
            int newSize = DEFAULT_CAPACITY * 2;
            Object[] newArray = new Object[newSize];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    public void addLast(E element) {
        ensureCapa();
        elements[size++] = element;
    }

    public void addEleByIndex(E element, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapa();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E e = (E) elements[index];
        Object[] newArray = new Object[size - 1];
        for (int i = 0, j = 0; i < size; i++, j++) {
            if (i == index) {
                j--;
                continue;
            }
            newArray[j] = elements[i];
        }
        elements = newArray;
        size--;
        return e;
    }

    public int getSize() {
        return size;
    }

    public Object clone() {
        try {
            ArrayList<E> clone = (ArrayList<E>) super.clone();
            clone.elements = new Object[elements.length];
            System.arraycopy(this.elements, 0, clone.elements, 0, size);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (element == null && elements[i] == null) {
                return true;
            }
            if (element != null &&elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element == null && elements[i] == null) {
                return i;
            }
            if (element != null && elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E element) {
        addLast(element);
        return true;
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[index];
    }

    public void clear() {
        size = 0;
    }

}
