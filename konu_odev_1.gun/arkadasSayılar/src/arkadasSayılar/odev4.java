package arkadasSay�lar;

public class odev4 {

	public static void main(String[] args) {
		int say�1=220;
		int say�2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i = 1 ;i<say�1 ;i++) {
			if(say�1%i==0);{
				toplam1=toplam1+i;
			}
		}
for(int i=1;i<say�2;i++) {
	if(say�2%i==0) {
		toplam2=toplam2+i;
	}
}
if(say�1==toplam2 && say�2==toplam1) {
	System.out.println("G�R�LEN SAYILAR ARKADA� SAYILARDIR");
}else {
	System.out.println("Bub iki say� arkada� de�ildir");
}
	}

}
