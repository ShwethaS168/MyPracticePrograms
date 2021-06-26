package Work;

public class Wave_Array {

	 public static void convertToWave(int arr[], int n){
         int tmp = 0;
      for(int i= 0; i<=n-2 ; i+=2) {
           tmp =arr[i+1];
           arr[i+1] = arr[i];
           arr[i] = tmp;
      }
   return; 
}
	 
}
