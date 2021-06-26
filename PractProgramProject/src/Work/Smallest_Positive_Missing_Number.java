package Work;

public class Smallest_Positive_Missing_Number {

	 static int findMissing(int arr[], int size)
	    {
	        if(arr.length == 0){
	             return  -1;
	        }
	        int i= 0;
	        while(i< arr.length){
	            
	            if(arr[i]>0 && arr[i] <= arr.length &&  arr[i] != arr[arr[i]-1]) {
	              int  correct_index = arr[i]-1 ;
	              int tmp;
	              tmp = arr[i] ;
	              arr[i] =  arr[correct_index] ;
	              arr[correct_index] =  tmp;
	         }
	          else 
	          i++;
	             
	        }
	        for(int j = 0; j<arr.length ;j++){
	            
	            if(arr[j] != j+1){
	                 return j+1;
	            }
	        }
	        
	        return  arr.length+1;
	    }
}
