public class ex {
    public static void main(String[] args) {
        String s="bbae";
        int even=0,odd=0;
        for(int i=0;i<s.length();i++)
        {
            int val;
            if(i%2==0) {
                val = s.charAt(i);
                even += val;
            }else {
                val = s.charAt(i);
                odd += val;
            }
        }
        System.out.println(even+" "+odd);
    }
}
