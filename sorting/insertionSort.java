package sorting;

public class insertionSort {

	public static void insertionsort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,4,3,5,2};
		insertionsort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
