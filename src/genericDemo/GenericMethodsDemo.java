package genericDemo;

class MyArray1<T>
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
public class GenericMethodsDemo {

    static <E> void show(E[] List)
    {
        for(E e:List)
        {
            System.out.println(e);
        }

    }
    static void fun(MyArray1 obj)
    {
        obj.display();
    }
    public static void main(String[] args) {
        show(new String[]{"HI","GO","BYE"});
        show(new Integer[]{10,20,30});

        System.out.println();
        System.out.println();

        MyArray1<String> a1=new MyArray1<>();
        a1.append("Hi");
        a1.append("How are you?");

        MyArray1<Integer> a2=new MyArray1<>();
        a2.append(10);
        a2.append(20);

        fun(a1);
        fun(a2);


    }

}
