public class reverse2 {
    public static void main(String args[]){
        int number, reverse=0;
        number=1345353;
        while(number!=0){
            int remainder= number%10;
            reverse= reverse*10 +remainder;
            number=number/10;
             
        }
        System.out.println("reverse number is"+reverse);

    }
    
}
