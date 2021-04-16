import java.util.Scanner;

//다음을 입력받아 계산하시오
//(삼각형넓이 = (밑변 * 높이)/2)  
//밑변 :  10  
//높이 :   3

public class ex6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("****삼각형의 넓이 구하기****");
		System.out.print("밑변 : ");
		int bottom = s.nextInt();
		System.out.print("높이 : ");
		int height = s.nextInt();
		
		double area = (double)(bottom*height)/2;
		System.out.printf("넓이 : %.2f",area);
	}

}
