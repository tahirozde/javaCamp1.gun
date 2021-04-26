package arkadasSayýlar;

public class odev4 {

	public static void main(String[] args) {
		int sayý1=220;
		int sayý2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i = 1 ;i<sayý1 ;i++) {
			if(sayý1%i==0);{
				toplam1=toplam1+i;
			}
		}
for(int i=1;i<sayý2;i++) {
	if(sayý2%i==0) {
		toplam2=toplam2+i;
	}
}
if(sayý1==toplam2 && sayý2==toplam1) {
	System.out.println("GÝRÝLEN SAYILAR ARKADAÞ SAYILARDIR");
}else {
	System.out.println("Bub iki sayý arkadaþ deðildir");
}
	}

}
