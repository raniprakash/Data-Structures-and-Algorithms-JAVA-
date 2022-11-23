package Arrays;

/*
   Declaring an Array
       dataType[] arrayName;
       arrayName= new dataType[n];
       OR
       dataType[] arrayName=new dataType[n];
 */
public class ArrayIntro {
    public static void main(String[] args) {
       // int[] marks= new int[];
       /* int[] marks;
          marks= new int[];
       */
        int[] age= {1,2,3,4,5};
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);
        }


    }
}
