package day7;

public class pro12 {

	public static void main(String[] args) {
		String[] arr= {"arun","arun","good","good","yash","yash"};
		String target = "yash";
		int first = -1;
		int last = -1;
		int start = 0;
		int end = arr.length -1;
		while(start<=end) {
			int mid = (start + end)/2;
			if(arr[mid].equals(target)) {
				first = mid;
				end = mid -1;
			}
			else if(target.compareTo(arr[mid])>0) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}
		}
		start = 0;
		end = arr.length -1;
		while(start<=end) {
			int mid = (start + end)/2;
			if(arr[mid].equals(target)) {
				last = mid;
				start = mid +1;
			}
			else if(target.compareTo(arr[mid])>0) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}
		}
		System.out.println("first:"+first);
		System.out.println("last:"+last);
	}
}
