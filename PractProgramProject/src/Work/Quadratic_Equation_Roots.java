package Work;

public class Quadratic_Equation_Roots {

	
	  public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
	         ArrayList<Integer> z =new ArrayList<Integer>(2);
	        // ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
	        
	       int d = (int)((b*b)-(4*a*c));
	        if (d<0){
	             z.add(-1);
	             //System.out.println("Imaginary") ;
	             // return z;
	        }
	        else if (d== 0){
	         int p = -b/(2*a);
	         
	         z.add(p);
	         z.add(p);
	        // return  z;
	        }  
	        
	        else {
	        int p =   (int)Math.floor((-1 * b + Math.sqrt(d))/  (2*a));
	        int q =   (int)Math.floor((-1 * b - Math.sqrt(d))/  (2*a));
	          z.add(Math.max(p,q));
	          z.add(Math.min(p,q));
	         
	        }
	        return z;
	    }
}
