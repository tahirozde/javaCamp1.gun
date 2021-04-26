package reCapDemo1;

public class miniProjeAsalSayý {

	public static void main(String[] args) {
		int sayý = 20;
		int remaender = sayý%2;
		boolean isPrime=true;
		for(int i=2;i<sayý;i++)
			if(sayý%i==0) {
				isPrime=false;
			}
		if(isPrime) {
			System.out.println("Girmiþ olduðunuz sayý asaldýr");
	
		}else {
			System.out.println("Sayý asal deðildir");
		}

	}

}
