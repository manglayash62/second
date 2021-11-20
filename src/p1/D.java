package p1;

public class D {
	public static void armStrongNumber(int num) {
		int cube=0;
		int r;
		int t;
		t=num ;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(cube==t) {
			System.out.println("Number");
		}else {
			System.out.println("not");
		}

	}
	public static void main(String[] args) {
		armStrongNumber(145);
	}
}
