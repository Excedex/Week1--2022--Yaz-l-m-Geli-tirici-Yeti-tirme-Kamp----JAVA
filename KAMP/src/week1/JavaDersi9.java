package week1;

public class JavaDersi9 {

	public static void main(String[] args) {
		int []sayi=new int[3];
		sayi[0]=24;
		sayi[1]=25;
		sayi[2]=2;
		int EnB�y�kSayi=0;
		
		for(int i=0;i<3;i++) {
			if(EnB�y�kSayi<sayi[i]) {
				EnB�y�kSayi=sayi[i];
			}
		}
		System.out.print(EnB�y�kSayi);

	}

}
