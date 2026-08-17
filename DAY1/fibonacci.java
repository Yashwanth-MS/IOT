import java.util.Scanner;
public class fibonacci {
	void fib(int a,int b,int n) {
		
		for(int i=0;i<n;i++) {
	    	System.out.println(a+"");
	    	int c=a+b;
	    	a=b;
	    	b=c;
	    }
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
	    int a=0;
	    int b=1;
	    fibonacci fib1=new fibonacci();
	    fib1.fib(a, b, n);
        sc.close();

	}

}