package day8;
public class pro8 {

	static int[] queue = new int[5];
	static int front = -1;
	static int rear = -1;

	static void enqueue(int value) {
		if ((rear + 1) % queue.length == front) {
			System.out.println("Queue is full");
		} 
		else if (front == -1) {
			front = 0;
			rear = 0;
			queue[rear] = value;
			System.out.println(value + " added");
		} 
		else {
			rear = (rear + 1) % queue.length;
			queue[rear] = value;
			System.out.println(value + " added");
		}
	}

	static void dequeue() {
		if (front == -1) {
			System.out.println("Queue is empty");
		} 
		else {
			System.out.println(queue[front] + " removed");

			if (front == rear) {
				front = -1;
				rear = -1;
			} 
			else {
				front = (front + 1) % queue.length;
			}
		}
	}

	static void display() {
		if (front == -1) {
			System.out.println("Queue is empty");
			return;
		}

		System.out.println("Queue available elements");

		int i = front;

		while (true) {
			System.out.print(queue[i] + " ");

			if (i == rear) {
				break;
			}

			i = (i + 1) % queue.length;
		}

		System.out.println();
	}

	public static void main(String[] args) {

		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		display();
		dequeue();
		dequeue();
		display();
		enqueue(60);
		enqueue(70);
		display();
	}
}
