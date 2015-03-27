//partnered with Yicheng Wang
import java.util.*;
import java.io.*;

public class ArrayQueue1<E> {
  private E[] data;

  public ArrayQueue1() {
    data = (E[])new Object[0];
  }

  public boolean empty() {
    return data.length == 0;
  }

  public void enqueue(E newEl) {
    E[] tmp = (E[])new Object[data.length + 1];
    for (int i = 0 ; i < data.length ; i++) {
      tmp[i] = data[i];
    }
    tmp[data.length] = newEl;
    data = tmp;
  }

  public E dequeue() {
    if (empty()) {
      throw new NoSuchElementException();
    }
    E retVal = data[0];
    E[] tmp = (E[])new Object[data.length - 1];
    for (int i = 0 ; i < data.length - 1 ; i++) {
      tmp[i] = data[i + 1];
    }
    data = tmp;
    return retVal;
  }

  public E head() {
    if (empty()) {
      throw new NoSuchElementException();
    }
    return data[0];
  }

  public String toString() {
      String s = "";
      for (E el : data) {
          s = s + el + "\n";
      }
      return s;
  }
}
