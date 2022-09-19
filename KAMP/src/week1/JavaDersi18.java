package week1;

public class JavaDersi18 {

	public static void main(String[] args) {
		
		String mesaj="  Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println(mesaj.replace(' ','-'));
		System.out.println(mesaj);
		String yenimesaj=mesaj.replace(' ','-');
		System.out.println(yenimesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
	
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());  //boþluk kaldýrdý.
	}
}
