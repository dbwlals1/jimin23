import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 
		int c = 0;
		int d = 0;
		
		int[][] arr = new int[5][5];
		arr[0][0]=1;
		
		for (int[] i : arr) {
			for (int a : i) {
				System.out.print(a + " ");
			}
			System.out.println();
			}
		while(true) {
		int num = s.nextInt();
		arr[c][c]=0;
        if (num == 1) {
                arr[c][d] = 0;
                d++;
                arr[c][d] = 1;
		}
		else if(num==-1) {
            arr[c][d] = 0;
            d--;
            arr[c][d] = 1;
		}
		else if(num==2) {
            arr[c][d] = 0;
            c--;
            arr[c][d] = 1;
		}
		else if(num==-2) {
            arr[c][d] = 0;
            c++;
            arr[c][d] = 1;
		}
		else if(num==0) {
			System.out.print("프로그램을 종료합니다.");
			break;
		}
		for (int[] i : arr) {
			for (int a : i) {
				System.out.print(a + " ");
			}
			System.out.println();
			}
	}
}
}