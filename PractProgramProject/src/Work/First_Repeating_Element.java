package Work;

public class First_Repeating_Element {

	public static int firstRepeated(int []arr, int n) 
    {
         int min = -1;
       // HashSet<Integer> a =  new HashSet<Integer>();
          HashSet<Integer> a =  new HashSet<>();
        for(int  i = n-1 ; i>=0  ; i--){
            if (a.contains(arr[i])){
                min = i+1;
            }
             else 
             a.add(arr[i]);
        }
          return min;
    }
}
