package Work;

public class Kadane_Algorithm {

    int maxSubarraySum(int arr[], int n){
        int  max_so_far = 0;
        int max_end_here  = 0;
        
        for(int i= 0; i<n; i++){
             max_so_far = max_so_far + arr[i] ;
             if(max_so_far< 0){
                 max_so_far = 0;
             }
             if(max_so_far >max_end_here) {
                 max_end_here = max_so_far ;
             } 
        }
        return   max_end_here ;
   }
}
