package Work;

public class Trapping_Rain_Water {

	   static int trappingWater(int arr[], int n) { 
	        
	        int  max_left = arr[0];
	        int max_right= arr[n-1] ;
	        int left = 1;
	        int  right = n-2;
	        int tw = 0;
	         while (left<=right) {
	              if(max_left < max_right){
	                  if(arr[left] < max_left){
	                     tw   =  tw+ (max_left- arr[left]);
	                        left++;
	                  }
	                  else{
	                  max_left = arr[left];
	                  left++;
	                  }
	              }
	              else{
	              if(arr[right]<max_right){
	                    tw   =  tw+ (max_right- arr[right]);
	                   right--;
	                   }
	              
	              else{
	                  max_right = arr[right];
	                  right--;
	                  }
	         
	         }
	         
	       }   
	         return tw;
	    } 
}
