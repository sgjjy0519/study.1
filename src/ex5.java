import java.util.Scanner;

//--입력--
//Input name : 민들래
//kor : 90 
//eng : 70 
//mat : 75

public class ex5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input name :");
		String name = s.next();
		System.out.print("kor :");
		int kor = s.nextInt();
		System.out.print("eng :");
		int eng = s.nextInt();
		System.out.print("mat :");
		int mat = s.nextInt();
		
		int sum = kor+eng+mat;
		double avg = (double)sum/3.0;
		
		System.out.println("이름 : "+name);
		System.out.println("합계점수 : "+sum);
		System.out.printf("평균점수 : %.1f",avg);
	}

}
