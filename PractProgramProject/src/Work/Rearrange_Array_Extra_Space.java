package Work;

public class Rearrange_Array_Extra_Space {

	  //Function to rearrange an array so that arr[i] becomes arr[arr[i]]
    //with O(1) extra space.
   static void arrange(long arr[], int n)
    {
        int i = 0;
        
        //Increasing all values by (arr[arr[i]]%n)*n to store the new element.
        for(i = 0; i < n; i++)
         arr[(int)i]+=(arr[(int)arr[(int)i]]%n)*n;
        
        //Since we had multiplied each element with n.
        //We will divide by n too to get the new element at that 
        //position after rearranging.
        for(i = 0; i < n; i++)
            arr[(int)i] = arr[(int)i]/n;
    }
}

