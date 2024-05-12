public class febonacci{
    public static void main(String args[]){
        int c=0; int d=1; int count=20;
        System.out.print(c+" "+d);
        for( int i=2; i<=count; ++i)
        {
            int k = c + d;
            System.out.print(" "+k);
            c=d;
            d=k;

            
        }
    }
}