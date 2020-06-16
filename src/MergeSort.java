import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * <PRE>
 * 1. FileName    : MergeSort.java
 * 2. Package     : 
 * 3. Comment     :
 * 4. Author      : Yong
 * 5. Create Date : 2020. 6. 16. 오후 12:30:29
 * </PRE>
 */
public class MergeSort {
	
	public static List<Integer> mergeSort(final List<Integer> values)
	{
		System.out.println("Start > " + values.toString());
		
		if(values.size() < 2)
			return values;
		
		final List<Integer> leftHalf = values.subList(0, values.size()/2);
		final List<Integer> rightHalf = values.subList(values.size()/2, values.size());
		
		return merge(mergeSort(leftHalf), mergeSort(rightHalf));
	}
	
	private static List<Integer> merge(final List<Integer> left, final List<Integer> right)
	{
		int leftPtr = 0;
		int rightPtr = 0;
		System.out.println("left > " + left.toString() + " | right > " + right.toString());
		
		final List<Integer> merged = new ArrayList<>(left.size() + right.size());
		
		while (leftPtr < left.size() && rightPtr < right.size())
		{
			if(left.get(leftPtr) < right.get(rightPtr))
			{
				merged.add(left.get(leftPtr));
				leftPtr++;
			}
			else
			{
				merged.add(right.get(rightPtr));
				rightPtr++;
			}
		}
		
		System.out.println("merging ... " + merged.toString());
		
		while (leftPtr < left.size())
		{
			merged.add(left.get(leftPtr));
			leftPtr++;
		}
		
		while (rightPtr < right.size())
		{
			merged.add(right.get(rightPtr));
			rightPtr++;
		}
		
		return merged;
	}
}
