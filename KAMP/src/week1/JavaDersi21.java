package week1;

public class JavaDersi21 {

	public static void main(String[] args) {
		
		//6--->1,2,3
		//28-->1,2,4,7,14
		int number=5;
		int total=0;
		for(int i=0;i<number;i++) {
			
			if(number%i==0) {
				total=total+i;
			}
			
			if(total==number) {
				System.out.println("M�kemmel say�d�r.");
			}
			else
				System.out.println("M�kemmel say� de�ildir.");
			
			
		}
		
	}

}
