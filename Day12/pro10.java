package day12;

import java.util.LinkedList;

public class pro10 {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();

		list1.add(1);
		list1.add(3);
		list1.add(5);

		list2.add(2);
		list2.add(4);
		list2.add(6);

		LinkedList<Integer> result = new LinkedList<>();

		int i = 0;
		int j = 0;

		while (i < list1.size() && j < list2.size()) {

			if (list1.get(i) < list2.get(j)) {
				result.add(list1.get(i));
				i++;
			} else {
				result.add(list2.get(j));
				j++;
			}
		}

		while (i < list1.size()) {
			result.add(list1.get(i));
			i++;
		}

		while (j < list2.size()) {
			result.add(list2.get(j));
			j++;
		}

		System.out.println(result);
	}
}