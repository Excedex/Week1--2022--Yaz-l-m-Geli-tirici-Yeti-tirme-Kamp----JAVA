package week1;

public class JavaDersi19 {

	public static void main(String[] args) {

		int number=25;
		int reminder=number%2;
		System.out.println(reminder);
		boolean isPrime=true;
		
		for(int i=2;i<number;i++) {
			if(number%2==0) {
				isPrime=false;
						
			}
		}
		if(isPrime) {
			System.out.println("Sayý Asaldýr.");
		}
		else
			System.out.println("Sayý Asal deðildir.");
		
		
	}

}
