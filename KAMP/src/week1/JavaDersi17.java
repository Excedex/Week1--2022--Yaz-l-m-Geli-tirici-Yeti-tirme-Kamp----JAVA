package week1;

public class JavaDersi17 {

	public static void main(String[] args) {
		
		String mesaj="Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s�: "+mesaj.length() );
		System.out.println("5. eleman : "+mesaj.charAt(4));
		
		System.out.println(mesaj.concat("Ya�as�n"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.startsWith("B"));
		
		char [] karakter=new char[5];
		mesaj.getChars(0,4,karakter,0);
		System.out.println(karakter);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.indexOf("va"));
	}

}
