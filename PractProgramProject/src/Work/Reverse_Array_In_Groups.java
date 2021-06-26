package Work;

public class Reverse_Array_In_Groups {

	  void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
          
          for( int i=0; i<n; i+=k){
                if(i+k<n){
                    reverseaction(arr,n,i,i+k-1) ;
                }
                else 
                reverseaction(arr,n,i, n-1);
          }
          
  }
  
  void reverseaction(ArrayList<Integer> arr, int n, int left, int right){
      int tmp;
      
      while(left<right){
           tmp = arr.get(left);
           arr.set(left, arr.get(right)) ;
           arr.set(right , tmp);
           
           left++;
           right--;
      }
  }
}
