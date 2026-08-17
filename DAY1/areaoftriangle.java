
public class areaoftriangle {
	double triangle(int h,int b) {
		return 0.5 * b * h;
	}

	public static void main(String[] args) {
		areaoftriangle area=new areaoftriangle();
		System.out.println(area.triangle(2,3));

	}

}