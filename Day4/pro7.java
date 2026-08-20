package day4;
import java.util.ArrayList;
public class pro7 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println("initial size "+list.size());
		System.out.println("contents of array "+list);
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("F");
		list.add("H");
		list.add("E");
		list.add("A");
		list.add(null); 
		System.out.println("size after adding "+list.size());
		System.out.println("checking empty or not "+list.isEmpty());
		System.out.println("contents of array "+list);
		boolean b1 = list.contains("E");
		System.out.println("is E present "+b1);
		boolean b2 = list.contains("R");
		System.out.println("is R present "+b2);
		list.remove("B");
		System.out.println("size after deleting "+list.size());
		System.out.println("contents of array "+list);
		list.clear();
		System.out.println("size after clearing "+list.size());
		System.out.println("contents of array "+list);
	}

}
