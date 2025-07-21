public class demo {
    static{
        System.out.println("hello world from static block-2");
    }
    {
        System.out.println("hello world from non-static  block-1");

    }
    {
        System.out.println("hello world from non-static  block-2");
    }
    
    public static void main(String[] args) {
        System.out.println("hello world from main method");
        demo d=new demo();
        demo d1=new demo();
    }
}
