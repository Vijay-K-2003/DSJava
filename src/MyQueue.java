import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

class NewQueue
{
    private int[] arr;
    private final int limit;
    private int next;
    public NewQueue(int l)
    {
        // constructor
        limit = l;
        arr = new int[l];
        next = 0;
    }
    public void enqueue(int i)
    {
        // enqueue method
        arr[next] = i;
        next++;
    }
    public int dequeue()
    {
        int ret = arr[0];
        for(int i = 1 ; i < next ; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[next-1] = 0;
        next--;
        return ret;
    }
    public int peek()
    {
        return arr[0];
    }
    public void printQueue()
    {
        System.out.println(Arrays.toString(arr));
    }
    public void clearQueue()
    {
        int n = next;
        for(int i = 0 ; i < n; i++)
        {
            dequeue();
            System.out.println(Arrays.toString(arr));
        }
    }
}
public class MyQueue
{
    public static void main(String[] args)
    {
        NewQueue q = new NewQueue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.enqueue(1);
        q.printQueue();
        q.dequeue();
        q.printQueue();
        System.out.println(q.peek());
        q.clearQueue();
        q.printQueue();
    }
}
