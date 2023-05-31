//
public class ArrayIntList {
    private int[] elementData;
    private int size;

    public static final int DEFAULT_CAPACITY = 100;

    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elementData = new int[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        return elementData[index];
    }

    public void add(int value) {
        elementData[size] = value;
        size++;
    }

    // returns a comma-separated, bracketed version of the list
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }
}
