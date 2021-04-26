package reCapDemo1;

public class reCapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1,2,3,4,5,6};
		double total=0;
		for(double number:myList) {
			total=total+number;
			System.out.println(number);
		}
System.out.println(total);
	}

}
