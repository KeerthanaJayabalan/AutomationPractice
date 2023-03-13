package javaPrograms;

public class SortingArray {

	public static void main(String[] args) {
		int a[]=new int[] {7,5,9,4,6,3,1,8};
		int temp=0;
		System.out.println("Original array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sorting: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
