//partnered with yicheng wang

import java.util.*;
import java.io.*;

public class ArrayQueue2<E> {
    private int beginning;
    private int length;
    private E[] data;

    public ArrayQueue2(int len) {
        data = (E[])new Object[len];
        beginning = 0;
        length = 0;
    }

    public boolean empty() {
        return length == 0;
    }

    public void enqueue(E newVal) {
        if (data.length == length) {
            throw new ArrayStoreException();
        }
        data[(beginning + length) % data.length] = newVal;
        length++;
    }

    public E dequeue() {
        if (length == 0) {
            throw new NoSuchElementException();
        }
        beginning++;
        length--;
        return data[beginning - 1];
    }

    public E head() {
        if (length == 0) {
            throw new NoSuchElementException();
        }

        return data[beginning];
    }

    public String toString() {
        String s = "";
        for (int i = 0 ; i < length ; i++) {
            s = s + data[(beginning + i) % data.length] + "\n";
        }
        return s;
    }
}
