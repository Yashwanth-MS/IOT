package day9;
import java.util.*;
public class pro8 {

	public static void main(String[] args) {
		String[] names = {"ravi","rahul","anand","rakesh","raj"};
		String search ="ra";
		ArrayList<String> result = new ArrayList<>();
		for(String name : names) {
			if(name.contains(search)) {
				result.add(name);
			}
		}
		System.out.println("search results:");
		for(String name : result) {
			System.out.println(name);
		}
	}

}
