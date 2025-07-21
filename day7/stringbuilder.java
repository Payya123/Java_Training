public class stringbuilder {
    public static void main(String[] args) {
        String s="hello";
        StringBuilder sb=new StringBuilder(s);  //StringBuilder is mutable
        sb.append("world");
        System.out.println(sb);
        sb.insert(5," ");
        System.out.println(sb);
        sb.delete(5,11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(20);
        System.out.println(sb.capacity());
        sb.setLength(5);
        System.out.println(sb);
        sb.replace(0,5,"helloworld");
        System.out.println(sb);
    }
}
        