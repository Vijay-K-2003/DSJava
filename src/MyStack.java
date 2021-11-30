import java.util.Arrays;
// non Generic Stack with Limit
class NewStack
{
    private int[] arr;
    private int next;
    private int top;
    private int limit;
    public NewStack(int l)
    {
        arr = new int[l];
        next = 0;
        limit = l;
    }

    // push method
    public void push(int i)
    {
        arr[next] = i;
        top = next;
        next++;
    }
    // pop method
    public void pop()
    {
        arr[top] = 0;
        top--;
        next--;
    }
    // clear all method
    public void clearAll()
    {
        int n = next;
        for(int i = 0 ; i < n; i++)
            this.pop();
    }
    // peek
    public int peek()
    {
        return arr[top];
    }
    public void printStack()
    {
        System.out.println(Arrays.toString(arr));
    }
}


public class MyStack
{
    public static void main(String[] args)
    {
        NewStack stk = new NewStack(10);
        stk.push(0);
        stk.push(1);
        stk.push(1);
        stk.push(1);
        stk.push(1);
        stk.push(1);
        stk.push(1);
        stk.push(1);
        stk.push(1);
        stk.push(1);

        stk.printStack();
        stk.pop();
        stk.printStack();
        stk.clearAll();
        stk.printStack();
    }
}
