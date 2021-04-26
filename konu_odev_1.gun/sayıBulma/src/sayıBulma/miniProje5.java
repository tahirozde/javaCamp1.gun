package sayıBulma;

public class miniProje5 {

	public static void main(String[] args) {
		int[] sayılar= new int[] {1,2,5,7,9,0};
		int aranacak=5;
	    boolean varMİ=false;
	    
	    for(int sayı:sayılar) {
	    	if(sayı==aranacak) {
	    		varMİ=true;
	    		break;
	    	}
	    }
	    if(varMİ) {
	    	System.out.println("Girmiş olduğun sayı listede var");
	    
	    }else {
	    	System.out.println("Girmiş olduğun sayılistede yok");
	    }

	}

}
