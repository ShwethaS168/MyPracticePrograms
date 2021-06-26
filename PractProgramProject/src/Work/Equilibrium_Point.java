package Work;

public class Equilibrium_Point {

	 public static int equilibriumPoint(long arr[], int n) {
         long total = 0;
         long left = 0;
         
         if (n ==1){
             return 1;
         }
         else {
for(int i= 0; i<n ; i++){
   total =total + arr[i] ;
}
for (int j=0; j<n ;j++){
     total = total - arr[j];
     if (left == total){
          return j+1;
     }
     else {
         left = left + arr[j] ;
     }
}
return -1;
}
}
}
