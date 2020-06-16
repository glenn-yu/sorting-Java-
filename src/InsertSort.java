import java.util.LinkedList;
import java.util.List;

/**
 * 
 */

/**
 * <PRE>
 * 1. FileName    : InsertSort.java
 * 2. Package     : 
 * 3. Comment     :
 * 4. Author      : Yong
 * 5. Create Date : 2020. 6. 16. 오전 11:38:03
 * </PRE>
 */
public class InsertSort {
	
	public static List<Integer> insertSort(final List<Integer> numbers)
	{
		final List<Integer> sortedList = new LinkedList<>();
		
		originalList: for (Integer number: numbers) {
			for(int i=0; i<sortedList.size(); i++)
			{
				System.out.println("Key1 : " + number + " | Key2 : " + sortedList.get(i) + " > list : " + sortedList);
				if(number < sortedList.get(i))
				{
					sortedList.add(i, number);
					continue originalList;
				}
			}
			sortedList.add(sortedList.size(), number);
		}
				
		return sortedList;
	}
}
