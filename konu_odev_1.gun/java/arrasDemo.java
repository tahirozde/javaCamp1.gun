package reCapDemo1;

public class arrasDemo {

	public static void main(String[] args) {
		String ogrenci1 ="engin";
		String ogrenci2 ="derin";
		String ogrenci3 ="Salih";
		String ogrenci4 ="ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		 System.out.println("-------------------------------------------");
		 
		 String[] ogrenciler = new String[4];
		 ogrenciler[0]="engin";
		 ogrenciler[1]="derin";
		 ogrenciler[2]="Salih";
		 ogrenciler[3]="ahmet";
		 
		 for(int i =0;i<ogrenciler.length;i++) {
			 
			 System.out.println(ogrenciler[i]);
		 }
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			for(String ogrenci:ogrenciler) {
				
				System.out.println(ogrenci);
			}

	}

}
