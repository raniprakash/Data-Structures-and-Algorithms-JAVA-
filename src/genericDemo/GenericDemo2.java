package genericDemo;

class MyArray<T>
{
    T A[]=(T[]) new Object[10];
    int length=0;
    public void append(T v)
    {
        A[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}
public class GenericDemo2 {
    public static void main(String[] args) {
        MyArray<Integer> arr=new MyArray<>();

        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.display();
    }
}
