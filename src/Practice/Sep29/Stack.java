package Practice.Sep29;

import java.util.EmptyStackException;

public class Stack {
    private int[] data;

    private final int DEFAULT_SIZE = 10;

    private int top = -1;

    public Stack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean push(int item){
        if (isFull()){
            return false;
        }

        data[++top] = item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return data[top--];
    }

    public int getTop(){
        return data[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == DEFAULT_SIZE-1;
    }
}
