package currencyUtil;

public class currencyutility {
	public static void merge (int arr[],int l,int m,int r)
	{
		int n1= m-l+1;
		int n2=r-m;
		
		int L[] = new int [n1];
		int R[] = new int [n2];
		
		for (int i =0;i<n1;i++)
			L[i]=arr[l+i];
		for(int j=0;j<n2;j++)
			R[j]=arr[m + 1 + j];
		
		int i=0;
		int j=0;
		
		int k =l;
		
		while(i<n1  && j< n2)
		{
			if(L[i] <= R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
		k++;
	}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
			
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
			
		}
		

	}

	public static void sorting(int array[], int left, int right) 
	{
		// TODO Auto-generated method stub
		if (left < right) {
			int mid = (left + right) / 2;
			sorting(array,left,mid);
			sorting(array,mid + 1,right);
			
			merge(array,left,mid,right);
		}
	}
	
	
	
}
