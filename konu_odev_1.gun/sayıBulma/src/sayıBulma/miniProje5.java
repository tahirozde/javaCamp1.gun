package say�Bulma;

public class miniProje5 {

	public static void main(String[] args) {
		int[] say�lar= new int[] {1,2,5,7,9,0};
		int aranacak=5;
	    boolean varM�=false;
	    
	    for(int say�:say�lar) {
	    	if(say�==aranacak) {
	    		varM�=true;
	    		break;
	    	}
	    }
	    if(varM�) {
	    	System.out.println("Girmi� oldu�un say� listede var");
	    
	    }else {
	    	System.out.println("Girmi� oldu�un say�listede yok");
	    }

	}

}
