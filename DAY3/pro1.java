package day3;

public class pro1 {

	public static void main(String[] args) {
		System.out.println("hello");
		try {
			System.out.println(10/0);
			System.out.println("hello");
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
