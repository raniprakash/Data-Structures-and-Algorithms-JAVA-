package Strings;
/*
    String is a non-primitive data-type.
    Usually, when something is initialised, it is stored in Heap area. But developers have created a separate area
    called "String pool area". When a string is initialised, the string pool area checks for this string in its pool, if
    it exists then it does not initialise it again, it reuses the already present string. This way the optimization is
    done.
    Strings are immutable.

 */
public class StringIntro {
    public static void main(String[] args) {
        String name="Abcdef";//String Initialisation by literals.(String pool area)
        String anotherName= new String("XYxy");//String initialisation.(Heap area)
        System.out.println(name);
        System.out.println(anotherName);

    }
}
