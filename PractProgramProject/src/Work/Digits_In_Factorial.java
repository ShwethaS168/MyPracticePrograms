package Work;

public class Digits_In_Factorial {

    public int digitsInFactorial(int N){
        if (N<0){
            return 0;
        }
        if(N<=1 ){
            return 1;
        }
        
        double digits =0;
        for (int i= 2 ;i<= N; i++){
             digits += Math.log10(i);
        }
        
        return  (int)(Math.floor(digits)) + 1;
    }
}
