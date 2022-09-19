package week1;

public class JavaDersi20 {

	public static void main(String[] args) {
		
		char harf='E';
		
		switch (harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalýn sesli harftir.");
				break;
			default:
				System.out.println("Ýnce sesli harftir.");
				break;
		}
		
	}

}
