import java.util.*;
public class factorsnum {
    public static void main(String[] args) {
      System.out.println("Enter the number");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int factors=0;
      for(int i=1;i<=num;i++){
        if(num%i==0){
             factors++;
             System.out.println(num + " is divisible by"+i);
        }
      }
      System.out.println("number of factors to "+num+"is"+factors);  
    }
    
}
