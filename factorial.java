public class factorial {
    public static void main(String args[]){
        int i,n,fact=1;
        n=4;
        for(i=1; i<=n; i++){
        fact=fact*i;
        }
        System.out.println("factorial of 4 is " +fact);
    }
    
}
