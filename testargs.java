package testargs;

public class TestArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[args.length];
		for (int i = 0; i < args.length; i++) {			
			a[i] = Integer.parseInt(args[i]);
		}		
		print(a);		
//		selectionSort(a);
		bubbleSort(a);
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");			
		}
		System.out.println();
	}
	//冒泡排序法
	public static void bubbleSort(int[] a) {
		for(int i=a.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(a[j] > a[j+1]) {
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
//选择排序法	
/*	private static void selectionSort(int[] a) {
		int k, temp;
		for (int i = 0; i < a.length - 1; i++) {
			k = i;
			for (int j = k + 1; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}				
			}
			if(k != i) {
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}*/
	
/*//效率不高 每循环一次可能交换多次
	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}*/

}
