package javalangpackage;

enum Dept
{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Sam","Block C"),ECE("Dave","Block D");

    String head;
    String location;

    //in enum the constructors must be either private or default

    private Dept(String head,String loc)
    {
        this.head=head;
        location=loc;
    }
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
}
public class EnumClass {
    public static void main(String[] args) {
        Dept d=Dept.CS;

        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }

}
