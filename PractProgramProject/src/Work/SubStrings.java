package Work;

public class SubStrings {
	
	  public static void subs(String s, int n){
	        StringBuilder  ss;
	        for(int i = 0; i< n ; i++){
	        ss = new StringBuilder().append(s.charAt(i));
	         System.out.println(ss);
	         
	         for(int j= i+1; j< n ; j++){
	             ss = ss.append(s.charAt(j)) ;
	              System.out.println(ss);
	         }
	        }
	    }
		public static void main (String[] args) {
		    
		    String s = "abv";
		    subs(s, s.length()) ;
			
		}

}
