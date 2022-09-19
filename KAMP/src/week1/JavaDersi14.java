package week1;

public class JavaDersi14 {

	public static void main(String[] args) {
		
		String[] öðrenciler=new String[4];
		öðrenciler[0]="Ali";
		öðrenciler[1]="Engin";
		öðrenciler[2]="Veli";
		öðrenciler[3]="Can";
		for(int i=0;i<öðrenciler.length;i++) {
			System.out.println(öðrenciler[i]);
		}
		
		System.out.println("--------------------------------------------------");
		
		for(String ogrenciler:öðrenciler) {
			System.out.println(ogrenciler);
		}
	}
}
