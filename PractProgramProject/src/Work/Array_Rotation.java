package Work;

public class Array_Rotation {

	 static void  reverseaction( int ar[] , int start , int nd ) {
	     int temp = 0;
	      while (start < nd) { 
	        temp = ar[start]; 
	        ar[start] = ar[nd]; 
	        ar[nd] = temp; 
	        start++; 
	        nd--; 
	    } 
	    }
		public static void main (String[] args) {
		    int ar[] = {2, 4 ,6 ,8, 10, 12 ,14, 16 ,18 ,20};
		    int n = 10; 
		    int d = 4;  // d = d%ar.length;
		    
			reverseaction(ar ,0, d-1) ;
		    reverseaction(ar ,d , n-1);
		    reverseaction(ar ,0, n-1) ;
		    for (int i = 0; i< ar.length ; i++){
		        
		        System.out.print( ar[i]+ " ")  ;
		    }
			
		}
}
