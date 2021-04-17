package algorithm.bubblesort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class BubblesortSample4 {
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
	 * 			int i : �迭�� ��ȸ�ϴ� Ƚ�� = 1��, 2��, 3��, ..., (list.size() - 1)��
	 * 
	 * 			int j : �迭�� 0�� index���� ��ȸ�ϴµ�,
	 * 					i�� ��ȸ���� 0������ (list.size() - i - 1)������  (list.size() - i) �� ��ȸ
	 * 					ex) i = 3, list.size() = 10 �϶�
	 * 						j�� 0�� ���� (10 - 3 - 1) = 6������ (10 - 3) = 7���� ��ȸ�ϰ� �ȴ�.
	 * 
	 * 			sortFlag :  �迭�� 0������ ��ȸ�Ҷ� �ѹ��̶� �ٲ�� false
	 * 						�迭�� index�� ��ȸ�ϰ� �� �ڿ� true�̸� ������ �Ϸ�Ǿ��ٰ� ���� �������´�.
	 * 						i��° �迭�� �������� true�� �ʱ�ȭ 
	 * 						
	 */
	public static List<Integer> bubblesort(List<Integer> list) {
		int temp;
		boolean sortFlag;
		for (int i = 1; i < list.size(); i++) {
			sortFlag = true;
			for (int j = 0; j < list.size() - i; j++) {
				if (list.get(j) > list.get(j + 1)) {
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j + 1, temp);
					sortFlag = false;
				} else {
					continue;
				}
			}
			if (sortFlag) {
				break;
			}
		}
		return list;
	}
}
