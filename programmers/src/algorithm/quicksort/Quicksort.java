package algorithm.quicksort;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {
	public List<Integer> quicksort(List<Integer> list){
		if(list.size() <= 1) {
			return list;
		}
		
		int center = list.get(0);
		
		// ���� �迭�� ������ �迭 ����
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		// center���� ���� ���� left��, center���� ū ���� right��
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) < center) {
				left.add(list.get(i));
			}else if(list.get(i) > center) {
				right.add(list.get(i));
			}
		}
		
		List<Integer> returnList = new ArrayList<Integer>();
		returnList.addAll(   quicksort(left)   );
		returnList.add(   center   );
		returnList.addAll(   quicksort(right)   );
		return returnList;
	}
}

