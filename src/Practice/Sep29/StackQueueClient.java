package Practice.Sep29;

public class StackQueueClient {
    public static void main(String[] args) {
        /*Stack stack = new Stack();

        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();*/

        Queue queue = new Queue();

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);

        queue.display();

        queue.remove();

        queue.display();
    }
}
