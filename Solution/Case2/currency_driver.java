package currencyMain;
import java.util.Arrays;
import java.util.Scanner;
import currencyUtil.currencyutility;

public class currency_driver {
	public static void  countCurrency(int amount, int[] notes)
	{
		int size = notes.length;
		int[] noteCounter = new int[size];
		
		currencyutility cu = new currencyutility();
		cu.sorting(notes,0,notes.length-1);
		reverse(notes);
		System.out.println("The Sorted array is " + Arrays.toString(notes));
		
		for(int i=0;i<size;i++) {
			if(amount >= notes[i]) {
				noteCounter[i]= amount /notes[i];
			amount =amount- noteCounter[i] * notes[i];
		}
	}
	
		System.out.println("Your payment approach in order to give the minimum number of notes will be");
		for (int i = 0;i<size; i++) {
			if(noteCounter[i]!= 0){
				System.out.println(notes[i] + " : " + noteCounter[i]);
			}
		}
	}
		public static void reverse(int [] notes)
		{
			int n = notes.length;
			
			for(int i = 0;i<n/2 ;i++)
			{
				int temp = notes[i];
				notes[i] = notes[n-i-1];
				notes[n-i-1] = temp;
				
			}
		}
		
		public static void main(String [] args)
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the Size of currency denomination");
			int size = sc.nextInt();
			int notes[] = new int[size];
			System.out.println("Enter the currency denomination value");
			for (int i = 0;i< size;i++) 
				{
				notes[i]= sc.nextInt();
				}
			System.out.println("enter the amount to pay");
			int amount = sc.nextInt();
			
			countCurrency(amount,notes);
			sc.close();
			
			
		}
}
