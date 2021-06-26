package Work;

public class GP_Term {

	 public double termOfGP(int A,int B,int N)
	    {
	        double r=((double)B)/A;
	        
	        // Nth term is given by a(r^(N-1))
	        return (A*Math.pow(r,N-1)); 
	        
	    }
}
