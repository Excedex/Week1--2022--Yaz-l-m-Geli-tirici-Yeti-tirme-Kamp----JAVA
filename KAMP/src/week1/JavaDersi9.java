package week1;

public class JavaDersi9 {

	public static void main(String[] args) {
		int []sayi=new int[3];
		sayi[0]=24;
		sayi[1]=25;
		sayi[2]=2;
		int EnBüyükSayi=0;
		
		for(int i=0;i<3;i++) {
			if(EnBüyükSayi<sayi[i]) {
				EnBüyükSayi=sayi[i];
			}
		}
		System.out.print(EnBüyükSayi);

	}

}
