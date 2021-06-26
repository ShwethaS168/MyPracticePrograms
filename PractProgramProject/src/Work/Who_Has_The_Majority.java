package Work;

public class Who_Has_The_Majority {

	 // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
       int c1=0 ;
       int c2 =0;
       for(int i =0; i< n ;i++){
           if (arr[i]==x){
               c1++;
           }
           if(arr[i]== y){
                c2++ ;
           }
           
       }
        if(c1<c2)
        {
            return y;
        }
        else if(c1>c2){
            return x;
        }
        else{ 
         if(x<y){
             return x;
         }
         else {return  y;}
        }
    }
}
