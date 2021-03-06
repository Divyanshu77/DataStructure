package sorting;

public class Quicksort {

	//Partition the array in two half.
	public static int partition(int arr[], int lo, int hi) {
		int p=arr[hi];
		int i=lo-1;
		for(int j=lo;j<=hi-1;j++) {
			if(arr[j]<=p) {
				i++;
				arr[j]=arr[i]+arr[j]-(arr[i]=arr[j]); //swap
			}
		}
		arr[hi]=arr[i+1]+arr[hi]-(arr[i+1]=arr[hi]);  //swap
		return (i+1);
	}
	
	//print the array element.
	public static void print(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
	}
	
	//QuickSort implementation
	public static void quickSort(int[] a,int low , int high) {
		if(low<high) {
			int pivot=partition(a,low,high);
			quickSort(a,low,pivot-1);
			quickSort(a,pivot,high);
		}			
	}
	
	public static void main(String[] args) {
		int[] quick= {2,4,1,9,11,7,7,91,13,21,3};
		int low=0,high=quick.length-1;
		quickSort(quick, low, high);
		for(int n:quick) {
			System.out.print(n+" ");
		}
	}
}
