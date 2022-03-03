package ArrayListChibuzo;

public class MyArrayList {

    private int size;
    private int capacity = 5;
    private String[] elements = new String[capacity];


    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFullCapacity(){
        if (size == elements.length - 1);
        return true;
    }

    public int add(String input) {
       if (isFullCapacity()){
        expandArray();
       }
        elements[size] = input;
        return size++;
    }

    private void expandArray() {
    int newCapacity = capacity * 2;
    String[] expandArray = new String[newCapacity];
        for (int i = 0; i < elements.length; i++) {
            expandArray[i] = elements[i];
        }
        elements = expandArray;
    }

    public int size() {
        return size;
    }

    public void remove(String input, int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = input;
    }

    public void insert(int index, String input) {
        if (isFullCapacity()){
            expandArray();
            for (int i = elements.length - 1; i < index; i--){
                elements[i] = elements[i - 1];
            }
        elements[size] = input;
        size++;
        }
        if (size < capacity) {
            for (int i = elements.length - 1; i < index; i--){
                elements[i] = elements[i - 1];
            }
            elements[index] = input;
            size++;
        }
    }

    public String getIndex(int index) {
        String atIndex = null;
     if (!isEmpty())  atIndex = elements[index];
         return atIndex;
     }


    public int getCapacity() {
        return elements.length;
    }
}

/* 1. Throw exeptions as at where appropriate,
    2. check full/empty capacity condition where needed.
    3. larger array creation also
*/
