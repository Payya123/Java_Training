public class pattern9 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n*2;i++){
             int totalcolInrow=i>n?2*n-i:i;
             int spaces=n-totalcolInrow;

            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=totalcolInrow;k>0;k--){
             System.out.print(k);  
            }
            for(int l=2;l<=totalcolInrow;l++){
                System.out.print(l);
            }
         System.out.println();
        }

    }
    
}
