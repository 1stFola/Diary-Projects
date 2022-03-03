package Chapter7.Practice;

import java.util.Arrays;

public class ArrayListByFola {

        private String[] folaArray;
        private int contentSize;
        private int capacity = 2;

    public ArrayListByFola() {
        this.folaArray = new String[capacity];
    }

    public ArrayListByFola(int capacity) {
        this.capacity = capacity;
        this.folaArray = new String[capacity];
    }

    public boolean add(String input) {
        if (contentSize < capacity){
            folaArray[contentSize] = input;
            contentSize++;
        }
        if (contentSize >= capacity){
            extendCapacity();
            folaArray[contentSize] = input;
            contentSize++;
        }

        return true;
    }

    private boolean extendCapacity() {
        int newCapacity = capacity * 2;
        String[] biggerArray = new String[newCapacity];

        for (int i = 0; i < folaArray.length; i++) {
            biggerArray[i] = folaArray[i];
            contentSize++;
        }
        folaArray = biggerArray;
        return true;
    }

    @Override
    public String toString() {
        return "ArrayListByFola{" +
                "folaArray=" + Arrays.toString(folaArray) +
                ", contentSize=" + contentSize +
                ", capacity=" + capacity +
                '}';
    }

    public static void main(String[] args) {
        ArrayListByFola fola = new ArrayListByFola();

        System.out.println(fola);

        fola.add("Fola");

    }
}


