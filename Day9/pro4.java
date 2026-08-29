package day9;

import java.util.PriorityQueue;

class Patient {
	String name;
	int priority;

	Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
}

public class pro4 {

	public static void main(String[] args) {
		PriorityQueue<Patient> queue = new PriorityQueue<>((p1, p2) -> p1.priority - p2.priority);
		queue.add(new Patient("anand", 2));
		queue.add(new Patient("rahul", 3));
		queue.add(new Patient("priya", 8));
		queue.add(new Patient("john", 6));
		while (!queue.isEmpty()) {
			Patient p = queue.poll();
			System.out.println(p.name + "-Priority" + p.priority);
		}

	}

}
