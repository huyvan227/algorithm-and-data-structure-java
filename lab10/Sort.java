public class Sort{
	public static void selectionSort(int[] arr){
		int n = arr.length;
		for(int i = 0; i<n;i++){
			int min = i;
			for(int j = i + 1 ;j<n;j++){
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] = tmp;
		}
	}
	
	public static void bubleSort(int[] arr){
		int n = arr.length;
		for(int i = 0; i<n-1;i++){
			for(int j = 0;j<n - i -1;j++){
				if(arr[j]> arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	public static void insertionSort(int[] arr){
		int n = arr.length;
		for(int i = 1;i<n;i++){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1]=key;
		}

	}
	public static void print(int[] arr){
		int n = arr.length;
		int i = 0;
		while( i < n){
			System.out.print(arr[i]+" ");
			i++;
		}
	}
	private static void merge(int arr[], int l, int m, int r){
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int [n1];
		int R[] = new int [n2];
		 
		for (int i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[m + 1+ j];
		
		int i = 0, j = 0;
		
		int k = l;
		while (i < n1 && j < n2){
			if (L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			 k++;
		}
		
		while (i < n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2){
			arr[k] = R[j];
			j++;
			k++;
		}
	}	
	public static void mergeSort(int[] arr, int first, int last){
		if (first < last){
			int middle = (first + last)/2;
			mergeSort(arr, first, middle);
			mergeSort(arr, middle + 1, last);
			merge(arr, first, middle, last);
		}
	}
		
		
	private static int partition(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++){
			if (arr[j] <= pivot){
				i++;
		 
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		 }
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
		
	public static void QuickSort(int[] arr, int low, int high){
		if (low < high){
		int pi = partition(arr, low, high);
		QuickSort(arr, low, pi - 1);
		QuickSort(arr, pi + 1, high);
	}
	}
	
	
	
	public static void main(String[] args){
		int arr[] = {2,1,3,4,5,2,1,9,22,15,12};
		System.out.println("Selection sort");
		print(arr);
		System.out.println("\n");
		selectionSort(arr);
		print(arr);
		System.out.println("\n");
		
		int arr1[] = {8,10,36,5,9,2,1,9,36,18,12};
		System.out.println("buble sort");
		print(arr1);
		System.out.println("\n");
		bubleSort(arr1);
		print(arr1);
		System.out.println("\n");
		
		int arr2[] = {4,8,5,23,45,89,54,12,0,16};
		System.out.println("selection sort");
		print(arr2);
		System.out.println("\n");
		selectionSort(arr2);
		print(arr2);
		System.out.println("\n");
		
		int arr3[] = {8,5,9,66,120,21,71,54,32,12,0,1};
		System.out.println("merge sort");
		print(arr3);
		System.out.println("\n");
		mergeSort(arr3,0,11);
		print(arr3);
		System.out.println("\n");
		
		int arr4[] = {45,88,0,94,12,36,1,2,5,8,7,6,34};
		System.out.println("Quick sort");
		print(arr4);
		System.out.println("\n");
		QuickSort(arr4,0,12);
		print(arr4);
	}
}