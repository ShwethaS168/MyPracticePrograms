package Work;

public class Leaders_In_An_Array {

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> R = new ArrayList<Integer>();
       
        
        int max= arr[n-1];
        A.add(max);
        //System.out.println(max);
        for (int i = n-2; i>= 0; i--){
             if (max<= arr[i]){
                 max = arr[i] ;
                 A.add(max);
             }
        }
        
        for(int j=A.size()-1; j>=0 ; j--){
            R.add(A.get(j));
        }
        return R;
        
    }
}
