package reCapDemo1;

public class reCap1 {

	public static void main(String[] args) {
		int sayı1=30;
		int sayı2=25;
		int sayı3=2;
		int enBuyuk=sayı1;
		
		if(enBuyuk<sayı2) {
			enBuyuk = sayı2;
		}
        if (enBuyuk<sayı3) {
        	enBuyuk = sayı3;
        }
        System.out.println("en büyük sayı"+enBuyuk);
	}


}
