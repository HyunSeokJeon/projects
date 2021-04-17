package algorithm.bubblesort;

import java.util.ArrayList;
import java.util.List;

public class BubblesortSample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(4);
		list.add(1);
		System.out.println(list);
		// ��� ��� -----------------------------------
		// [7, 4, 1]
		// ---------------------------------------------
		int temp;
		// ���� �ڵ�
		for (int i = 1; i < list.size(); i++) {

			for (int j = 0; j < list.size() - i; j++) {

				if (list.get(j) > list.get(j + 1)) {

					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

				} else {
					continue;
				}

			}

		}
		System.out.println(list);
		// ���� ��, ��� ��� ------------------------
		// [1, 4, 7]
		// ---------------------------------------------
	}
}

