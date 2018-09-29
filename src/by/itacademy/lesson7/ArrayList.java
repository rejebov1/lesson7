package by.itacademy.lesson7;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int index = 0;

    public ArrayList() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(T element) {
        if (index >= array.length) {
            T[] newArray = (T[]) new Object[array.length + DEFAULT_CAPACITY];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[index] = element;
        index++;
    }

    @Override
    public T get(T element) {
            if (index < 0 || index >= array.length) {
                throw new IndexOutOfBoundsException();
            }
            return array[index];
        }

    @Override
    public Object size() {
        return size();
    }

    @Override
    public boolean remove(Object element) {
            int index = (int) element;
            if (index == -1) {
                return false;
            }
            remove(index);
            return false;
    }


    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                ", index=" + index +
                '}';
    }

}


