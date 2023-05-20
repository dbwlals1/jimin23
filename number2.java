import java.util.*;

public class number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 
		
		int c = 0;
		
		int[] arr = new int[10];
		arr[0]=1;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			}
		System.out.println(" ");
		while(true) {
		
		int num = s.nextInt();
		arr[c]=0;
		if(num==1) {
			arr[c] = arr[c++];
			arr[c]=1;
		}
		else if(num==-1) {
			arr[c] = arr[c--];
			arr[c]=1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			} 
		System.out.println();
	}
}
}
