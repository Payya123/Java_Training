public class supermarket {
    String name;
    String pname;
    int price;
    int discount;
    // global variables,non-static variables,feilds
    public static void main(String[] args) {
        int a=20;
        supermarket product1=new supermarket();
        product1.name="rice";
        product1.price=50;
        product1.discount=5;
        System.out.println(product1.name);

       supermarket product2=new supermarket();
        product2.pname="biscuits";
        product2.price=10;
        product2.discount=2;
        System.out.println(product2.pname);
        
    }
}
