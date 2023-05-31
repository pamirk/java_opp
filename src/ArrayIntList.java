//
public class ArrayIntList {
    private int[] elementData;
    private int size;

    public ArrayIntList() {
        this(100);
    }

    public ArrayIntList(int capacity) {
        elementData = new int[capacity];
        size = 0;
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
