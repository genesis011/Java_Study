package ban05;

import ban06.BanB01;

public class BanAMain {

	public static void main(String[] args) {
		//같은 패키지 가져옴
		BanA01 banA01 =new BanA01();//public class
		banA01.pubNo=10;
		//banA01.prriNo;
		banA01.defNo=10;
		banA01.protectedNo=10;
		
		BanA02 banA02 =new BanA02();//default class
		//banA02.pubNo=10;//퍼블릭만 접근 가능
		//banA02.prriNo;//퍼블릭만 접근 가능
		
		//다른 패키지 있는것을 가져옴.
		BanB01 banB01 =new BanB01();
		banB01.pubNo=10;
		//banA01.prriNo;
		//banB01.defNo=10;//접근이 안되는 패키지
		//banBo1.protected int protectedNo;//상속이 될때는 된다.
		//프로택티드는 디폴트와 똑같다. 단 상속에서만 가능하다.
		
		//BanB02 banB02 =new BanB02();
	}
}
