package Work;

public class Subarray_With_Given_Sum {

	 static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	    {
	         ArrayList<Integer>  A = new ArrayList<Integer>() ;
	         int  start = 0 ,  i;
	        int cur_sum  = arr[0];
	         
	         for (i=1 ;i<=n ; i++){
	                while (cur_sum > s &&  start < i-1){
	                    cur_sum =  cur_sum - arr[start] ;
	                    start ++ ;
	                }
	                
	                if (cur_sum == s){
	                    int  p = i-1 ;
	                    A.add(start+1);
	                    A.add(p+1);
	                    return A;
	                }
	                if(i< n){
	                cur_sum = cur_sum + arr[i] ;
	                }
	         }
	         A.add(-1);
	          return A;
	    }
}
