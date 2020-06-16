import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */

/**
 * <PRE>
 * 1. FileName    : main.java
 * 2. Package     : 
 * 3. Comment     :
 * 4. Author      : Yong
 * 5. Create Date : 2020. 6. 16. 오전 11:32:45
 * </PRE>
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int[] bNumbers = { -3, -5, 1, 7, 4, -2 };
		
		System.out.println("===== Bubble Sort =====");
		System.out.println("Origin  : " + Arrays.toString(bNumbers));
		new BubbleSort(bNumbers);
		
		System.out.println("Sorting : " + Arrays.toString(bNumbers));
		
		
		final int[] iNumbers = { -4, 1, -1, -7, 4, -5 };

		System.out.println("===== Insert Sort =====");
		System.out.println("Origin  : " + Arrays.toString(iNumbers));
		// int > Integer 변환 방법, primitive type -> reference type
		List<Integer> insertSortResult = InsertSort.insertSort(Arrays.stream(iNumbers).boxed().collect(Collectors.toList()));
		
		System.out.println("Sorting : " + insertSortResult.toString());
		
		final int[] qNumbers = { 4, 8, -2, 7, -4, -5, -1, 2 };

		System.out.println("===== Quick Sort =====");
		System.out.println("Origin  : " + Arrays.toString(qNumbers));
		
		List<Integer> quickSortResult = QuickSort.quicksort(Arrays.stream(qNumbers).boxed().collect(Collectors.toList()));
		
		System.out.println("Sorting : " + quickSortResult.toString());
		
		final int[] mNumbers = { 4, 8, -2, 7, -4, -5, -1, 2 , -7, 5, 6, -6, 9};

		System.out.println("===== Merge Sort =====");
		System.out.println("Origin  : " + Arrays.toString(mNumbers));
		
		List<Integer> mergeSortResult = MergeSort.mergeSort(Arrays.stream(mNumbers).boxed().collect(Collectors.toList()));
		
		System.out.println("Sorting : " + mergeSortResult.toString());
	}

}
