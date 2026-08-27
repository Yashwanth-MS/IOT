package day7;

public class pro2 {
	static void count(int n) {
	if(n==0) {
		return;
	}
	System.out.println("Calling count(" +n+ ")");
	count(n-1);
	System.out.println("Returning froum count(" +n+ ")");
	}
	
	public static void main(String[] args) {
		count(5);

	}

}