public class reverse{
    public static void main(String args[]){
        int n,reverse = 0;
         n = 2345;
        for(;n!= 0; n=n/10){
           int remainder = n%10;
            reverse = reverse*10 + remainder;    
           }
        System.out.println("reverse number is"+reverse);
    }
    
}
