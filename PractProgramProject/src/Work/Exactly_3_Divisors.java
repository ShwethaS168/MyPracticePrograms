package Work;

public class Exactly_3_Divisors {
	public int exactly3Divisors(int N)
    {
        
        int result = 0;
        for(int i= 1; i*i<=N ; i++){
            if(isPrime(i)){
                 if(i*i <=N){
                     result += 1;
                 }
            }
            
           }
        return result;
    }
    
    public boolean isPrime(int N) {
        
         if (N == 0 || N == 1)
             return false;
         for (int i=2; i<=  (int)Math.sqrt(N); i++) {
            if (N%i== 0){
                return false;
            }
         }
          return true;
    }  
}
