import java.util.*;
public class posneg {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i>0){
            System.out.println("it is positive");
         } else if(i<0){
            System.out.println("it is negative");
        }else{
            System.out.println("it is equal to zero");
        }
        sc.close();
    }
}
