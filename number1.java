import java.util.Scanner;

public class number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[10];
		arr[0]=1;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			}
		System.out.println();
		
		int num = s.nextInt();
		
		arr[0]=0;
		arr[num-1]=1;
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}

}
}