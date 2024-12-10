public class sub {
    public static String subString(String str,int si,int ei)
    { String s1="";
    for(int i=si;i<ei-1;i++)
    {
        s1=s1+str.charAt(i);
    }
            return s1;
    }
    public static void main(String[] args) {
        String str="Helloworld";
        System.out.println(subString(str, 0, 5));
    }
    
}
