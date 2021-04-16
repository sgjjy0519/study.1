// a 와  b의 값을 형변환해서 두수의 곱을 구하시오
public class ex1 {

	public static void main(String[] args) {
		String a = "100";
		String b = "200";
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		
		System.out.printf("%d * %d = %d",c,d,c*d);
	}

}
