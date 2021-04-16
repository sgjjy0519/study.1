//65430원을 만들기 위한 화폐의 갯수를 구하시오.
//money = 65430원
public class ex2 {

	public static void main(String[] args) {
		
// 		내가 한거
//		int money = 65430;
//		int man = 65430/10000;
//		int chun = 5430/1000;
//		int baek = 430/100;
//		int sip = 30/10;
//		
//		System.out.println("만원="+man);
//		System.out.println("천원="+chun);
//		System.out.println("백원="+baek);
//		System.out.println("십원="+sip);
		
		int money = 65430;
		int a,b,c,d;
		
		System.out.println("money="+money);
		a = money/10000;	 // 65430/10000 = 6 
		money -= a*10000;    // money = 65430-60000 
		b = money/1000;		 // 5430/1000 = 5 
		money -= b*1000;	 // money = 5430-5000
		c = money/100;	     // 430/100 = 4
		money -= c*100;	 	 // money = 430-400
		d = money/10;		 // 30/10 = 3
		
		System.out.println("만원="+a);
		System.out.println("천원="+b);
		System.out.println("백원="+c);
		System.out.println("십원="+d);
	}

}
