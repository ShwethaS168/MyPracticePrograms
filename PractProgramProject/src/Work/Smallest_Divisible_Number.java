package Work;

public class Smallest_Divisible_Number {

	public static long getSmallestDivNum(long n){
        // code here
         
        long ans =1;
        for(long i= 1; i<=n; i++){
        ans = (ans*i) / (gcd(ans,i) ) ;
        }
        return ans;
        
    }
    
    static long gcd(long a,long b){
          if (a%b != 0){
            return  gcd (b, a%b);
          }
          else return b;
          
    }
}
