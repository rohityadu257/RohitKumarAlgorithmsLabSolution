import java.util.Scanner;

public class paymoney { 
	public static int transaction(int [] arr, int target) {
		int sum=0;
		for(int i = 0;i<arr.length;i++) {
			sum += arr[i];
			if(sum >= target)
				return i+1;
			
		}
		return -1;
		
	
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Transaction Array :")	;
		int size = sc.nextInt();
		int number [] = new int [size];
		System.out.println("Enter the Value of Transaction array");
		for (int i =0;i<size;i++) {
			number[i]= sc.nextInt();
		}
		
		System.out.println("Enter the Number of Targets");
		int n =sc.nextInt();
		for (int i= 0;i<n;i++) {
			System.out.println("Enter the value of Targets");
			int target = sc.nextInt();
			int nooftransaction = transaction(number,target);
			
			if(nooftransaction == -1) {
				System.out.println("The GIven Target is not achieved");
			}
			else {
				System.out.println("The Target is acheived after " + nooftransaction +" transaction");
			}
		}
		sc.close();	
	}
}
