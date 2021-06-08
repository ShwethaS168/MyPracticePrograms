class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int k;
        for(int i= 0; i<n; i++){
            if(arr2[0] <arr1[i]){
                long tmp = arr2[0] ;
                arr2[0] = arr1[i] ;
                arr1[i] =  tmp;
            }
        long  first_element = arr2[0] ;
           for( k= 1; k<m && arr2[k] < first_element; k++){
                arr2[k-1] = arr2[k] ;
           }
            arr2[k-1] = first_element ;
        }
    }
}
