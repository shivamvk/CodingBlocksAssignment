package Practice.Sep29;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Queue {
    private static int DEFAULT_SIZE = 10;

    private int end = 0;

    private int[] data;

    public Queue() {
        data = new int[DEFAULT_SIZE];
    }

    public boolean insert(int item){
        if (isFull()){
            throw new StackOverflowError();
        }

        data[end++] = item;
        return true;
    }

    public int remove(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        int temp = data[0];

        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i+1];
        }

        end--;

        return temp;
    }

    public void display(){
        System.out.println(Arrays.toString(data));
    }

    public boolean isFull(){
        return end == DEFAULT_SIZE;
    }

    public boolean isEmpty(){
        return end == 0;
    }
}
