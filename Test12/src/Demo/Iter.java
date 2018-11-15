package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iter {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		ListIterator it=list.listIterator();
		/*while(it.hasNext())
		{
			System.out.println(it.next());
		}
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}*/
		
		it.r
		System.out.println(list);
		
		/*Integer[] arr={1,0,0,while(it.hasNext())
		{
			System.out.println(it.next());
		}
		1,1,1,0};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));*/
	}

}
