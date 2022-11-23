package Strings;
/*
    String is basically a Class which has functions.
    The functions in String are:
        - char charAt(int index)
        - int length()
        - String substring(int beginIndex)
        - String substring(int beginIndex, int endIndex)
        - boolean contains(CharSequence s)
        - boolean equals(Object another)
        - boolean isEmpty()
        - String concat(String str)
        - String replace(char old, char new)
        - String[] split(String regex)
        - int indexOf(int ch)
        - String toLowerCase()
        - String toUpperCase()
        - String trim()

 */
public class StringFunctions {
    public static void main(String[] args) {
        String name="Java Programming";
        String anotherName="Java Programming";
        String name2="";


        //char charAt(int index)
        System.out.println(name.charAt(0));

        //int length()
        System.out.println(name.length());

        //String substring(int beginIndex)
        System.out.println(name.substring(5));

        //String substring(int beginIndex, int endIndex)
        System.out.println(name.substring(5,12));

        //boolean contains(CharSequence s)
        System.out.println(name.contains("Program"));

        //boolean equals(Object another)
        /* When you have initialised two strings differently, and you want to check if they are same then
           (name==anotherName) doesn't work, it returns false even if the strings are same. To over come this, we use
         */
        System.out.println(name.equals(anotherName));

        //boolean isEmpty()
        System.out.println(name2.isEmpty());

        //String concat(String str)
        /*  Strings can be usually concatenated by using simple "+" sign.
            There also exists a function which helps in string concatenation.
         */
        System.out.println(name.concat(" Tutorials"));

        //String replace(char old, char new)
        System.out.println(name.replace('a','p'));

        System.out.println();


        //String[] split(String regex)
        //Here regex stands for read-expression.

        String cars="Ford,Ferrari,Mercedes,Lamborghini";
        String[] allCars=cars.split(",");
        for(String car:allCars){
            System.out.println(car);
        }

        //int indexOf(int ch)
        System.out.println(name.indexOf('P'));


        //String toLowerCase()
        System.out.println(name);

        //String toUpperCase()
        System.out.println(name);

        //String trim():removes all the trailing spaces.
        String ab="   JAVA   ";
        System.out.println(ab.trim());
    }
}

