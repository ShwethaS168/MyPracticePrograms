package Work;

public class Modular_Multiplicative_Inverse {

	
	 public int modInverse(int a, int m)
	    {
	        int t = 0;
	        int b= 0;
	         if( gcdofco(a,m) == 1)
	         {
	             for( b = 0; b<m ; b++){
	               t=  ((a%m)* (b%m))%m ;
	               if (t ==1){
	                 return b;
	             }
	             }
	    }
	     return -1;
	    }
	 
	   static int gcdofco(int a,int b){
	          if (a%b != 0){
	            return  gcdofco(b, a%b);
	          }
	          else return b;
	          
	    }
}
