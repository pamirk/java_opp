//
public class ArrayIntList {
    private int[] elementData;
    private int size;

    public ArrayIntList() {
        elementData = new int[100];
        size = 0;
    }
    public void add(int value) {
        elementData[size] = value;
        size++;
    }

}
