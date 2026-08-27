package day7;

public class pro14 {

    public static void main(String[] args) {
    	
        String[] sizes = {"arun","bad","good","yash"};
        String target = "bad"
        		+ "";
        int start = 0;
        int end = sizes.length - 1;
        String floor = "";
        String ceil = "";
        while (start <= end) {
            int mid = (start + end) / 2;
            if (sizes[mid].equals(target)) {
                floor = sizes[mid];
                ceil = sizes[mid];
                break;
            } 
            else if (target.compareTo(sizes[mid])>0) {
                floor = sizes[mid];    
                start = mid + 1;       

            }
            else {
            	
                ceil = sizes[mid];     
                end = mid - 1;         
            }
        }

        System.out.println("Floor = " + floor);
        System.out.println("Ceil = " + ceil);
    }
}