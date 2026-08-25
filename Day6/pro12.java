package day6;

public class pro12 {
	    public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("Hello");

	        System.out.println("Original: " + sb);
	        sb.append(" World");
	        System.out.println("After append: " + sb);
	        sb.insert(6, "Java ");
	        System.out.println("After insert: " + sb);

	        sb.replace(6, 10, "Python");
	        System.out.println("After replace: " + sb);
	        sb.delete(6, 13);
	        System.out.println("After delete: " + sb);
	    }


}
