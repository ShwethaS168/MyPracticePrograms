package Work;

public class Reverse_Array {

	void resry( int[] ar, int start,  int end){
		 if (start >= end){
		 return;
		 }
		   int temp= ar[start];
		   ar[start]= ar[end];
		   ar[end] =  temp;
		   resry(ar, start+1,  end-1) ;  
		}
}
