import java.util.Arrays;

class NewGenStack<T>
{
    private T[] arr;
    private int next;
    private int top;
    private final int limit;

    @SuppressWarnings("unchecked")
    public NewGenStack(int l)
    {
        arr = (T[]) new Object[l];
        limit = l;
    }
    // push method
    public void push(T i)
    {
        arr[next] = i;
        top = next;
        next++;
    }
    // pop method
    public T pop()
    {
        T ret = arr[top];
        arr[top] = null;
        top--;
        next--;
        return ret;
    }
    // clear all method
    public void clearAll()
    {
        int n = next;
        for(int i = 0 ; i < n; i++)
            this.pop();
    }
    // peek
    public T peek()
    {
        return arr[top];
    }
    // printing stack
    public void printStack()
    {
        System.out.println(Arrays.toString(arr));
    }
    // helper getLimit
    public int getLimit()
    {
        return limit;
    }
}
public class MyGenStack
{
    public static void main(String[] args)
    {
        // Integer Double Character String
        NewGenStack<Integer> ngs = new NewGenStack<>(10);
        ngs.push(1);
        ngs.push(1);
        ngs.push(1);
        ngs.push(1);
        ngs.push(1);
        ngs.push(1);
        ngs.push(1);
        ngs.push(1);
        ngs.push(1);
        ngs.push(1);
        ngs.printStack();
        ngs.pop();
        ngs.printStack();
        ngs.clearAll();
        ngs.printStack();
    }
}
