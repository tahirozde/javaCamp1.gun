package reCapDemo1;

public class swich {
	public static void main(String[] args) {
	char grade ='H';
		
		switch (grade) {
		case 'A':
			System.out.println("M�kkemmel : ge�tiniz");
			break;
		case 'B' :
			System.out.println("�ok g�zel : ge�tiniz");
			break;
		case 'C' :
			System.out.println("iyi  : ge�tiniz");
			break;
		case 'D' :
			System.out.println("idare eder: ge�tiniz");
			break;
		case 'F':
			System.out.println("OLMADI : KALDINIZ");
			break;
			default:
				System.out.println("Ge�ersiz bir not ald�n�z");
	
		}
		
	}		

}
