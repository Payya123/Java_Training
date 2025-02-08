import java.util.Arrays;

public class stringdemo6 {
    public static void main(String[] args) {
        String s="hello world is first problem";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
           System.out.println(ch[i]);           
        }
        String s1=new String(ch);
        System.out.println(s1);
        System.out.println(Arrays.toString(ch));
    }

    
}
