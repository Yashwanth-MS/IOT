package day11;

public class pro7
{

	public static void main(String[] args) {
		int n=8;
		int prev2=0;
		int prev1=1;
		System.out.println(prev2+" \n"+prev1+" ");
		for(int i=2;i<=n;i++) {
			int current=prev1+prev2;
			System.out.println(current+" ");
			prev2=prev1;
			prev1=current;
		}

	}}