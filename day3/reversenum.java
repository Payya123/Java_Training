import java.util.*;
public class reversenum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        while(num>0){
            int lastdigit = num % 10;
            answer = answer * 10 +lastdigit;
            num = num/10;
        }
        System.out.println("reverse num:"+ answer);
    }
    
}
