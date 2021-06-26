package Work;

public class Remove_Duplicates_From_Sorted_Array {

	
    int remove_duplicate(int A[],int N){
        if (N==0 || N==1) 
            return N; 
       
        int[] temp = new int[N]; 
          
        // Start traversing elements 
        int j = 0; 
        for (int i=0; i<N-1; i++){ 
            // If current element is not equal 
            // to next element then store that 
            // current element 
            if (A[i] != A[i+1]) 
                temp[j++] = A[i]; 
        }
        // Store the last element as whether 
        // it is unique or repeated, it hasn't 
        // stored previously 
        temp[j++] = A[N-1];    
          
        // Modify original array 
        for (int i=0; i<j; i++) {
           A[i] = temp[i]; 
        }
        return j;
    }
}
