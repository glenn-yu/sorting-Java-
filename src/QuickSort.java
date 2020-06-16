import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * <PRE>
 * 1. FileName    : QuickSort.java
 * 2. Package     : 
 * 3. Comment     :
 * 4. Author      : Yong
 * 5. Create Date : 2020. 6. 16. 오후 12:13:39
 * </PRE>
 */
public class QuickSort {

	public static List<Integer> quicksort(List<Integer> numbers)
	{
		System.out.println("Start > " + numbers.toString());
		if(numbers.size() < 2)
			return numbers;
		
		final Integer pivot = numbers.get(0);
		final List<Integer> lower = new ArrayList<>();
		final List<Integer> higher = new ArrayList<>();
		
		for(int i=1; i < numbers.size(); i++)
		{
			if(numbers.get(i)< pivot)
			{
				lower.add(numbers.get(i));
			}
			else
			{
				higher.add(numbers.get(i));
			}
			System.out.println("Key : " + pivot + " | lower : " + lower.toString() + " | higher : " + higher.toString());
		}
		
		final List<Integer> sorted = quicksort(lower);
		sorted.add(pivot);
		sorted.addAll(quicksort(higher));
		System.out.println("Sorting .... " + sorted.toString());
		
		return sorted;
		
	}
	
}
