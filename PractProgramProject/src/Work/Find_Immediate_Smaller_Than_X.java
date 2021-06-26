package Work;

public class Find_Immediate_Smaller_Than_X {

	
    public static int immediateSmaller(int arr[], int n, int x)
    { 
        int  max = -1;
         for(int i=0; i<n ;i++){
             if(arr[i]< x){
                 if(arr[i]>max){
                     max =  arr[i] ;
                 }
             }
         }
         return max;
    }
}
