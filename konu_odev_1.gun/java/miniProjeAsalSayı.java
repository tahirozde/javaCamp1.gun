package reCapDemo1;

public class miniProjeAsalSay� {

	public static void main(String[] args) {
		int say� = 20;
		int remaender = say�%2;
		boolean isPrime=true;
		for(int i=2;i<say�;i++)
			if(say�%i==0) {
				isPrime=false;
			}
		if(isPrime) {
			System.out.println("Girmi� oldu�unuz say� asald�r");
	
		}else {
			System.out.println("Say� asal de�ildir");
		}

	}

}
