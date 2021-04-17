package algorithm.bubblesort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class BubblesortSample3 {
	public static void main(String[] args) {
		Random random = new Random();
		IntStream a = random.ints(1, 10000);
		Iterator<Integer> iterator = a.iterator();
		List<Integer> list = new ArrayList<Integer>();
		int b;
		while (list.size() != 100) {
			b = iterator.next();
			list.add(b);
			
		}
		System.out.println(list);
		bubblesort(list);
		System.out.println(list);
		
		
	}
	
	/**
	 * @author hyunseok
	 * @param list
	 * @return bubblesorted list
	 * @summary 
	 * 			temp : �� ���� �ٲܶ� �ӽ÷� �� ����
	 * 			ex) a = 1, b = 10 �϶� a = 10, b = 1�� ����� ����
	 * 				temp = a
	 * 				a = b
	 * 				b = temp
	 * 				���� ���� �������� ���
	 * 
	 */
	public static List<Integer> bubblesort(List<Integer> list) {
		int temp;
		
		for (int i = 1; i < list.size(); i++) {
			
			for (int j = 0; j < list.size() - i; j++) {
				
				if (list.get(j) > list.get(j + 1)) {
					
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j + 1, temp);
					
				} else {
					continue;
				}

			}

		}
		return list;
	}
}
