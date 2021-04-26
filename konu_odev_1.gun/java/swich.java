package reCapDemo1;

public class swich {
	public static void main(String[] args) {
	char grade ='H';
		
		switch (grade) {
		case 'A':
			System.out.println("Mükkemmel : geçtiniz");
			break;
		case 'B' :
			System.out.println("çok güzel : geçtiniz");
			break;
		case 'C' :
			System.out.println("iyi  : geçtiniz");
			break;
		case 'D' :
			System.out.println("idare eder: geçtiniz");
			break;
		case 'F':
			System.out.println("OLMADI : KALDINIZ");
			break;
			default:
				System.out.println("Geçersiz bir not aldýnýz");
	
		}
		
	}		

}
