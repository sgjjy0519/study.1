//급여명세서를 작성하시오
//  조건1) 기본급이 1,500,000원,수당이 55,000원,세금은 기본급의 10%
//  조건2) 실수령액 = 기본급 + 시간수당 - 세금
public class ex3 {

	public static void main(String[] args) {
		int pay = 1500000;     //기본급
		int timepay = 55000;		 //시간수당
		double tax = pay*0.1;	 //세금
		
		int resultPay = pay+timepay-(int)tax; // 실수령액
		
		System.out.println("실수령액:"+resultPay+"원");

	}

}
