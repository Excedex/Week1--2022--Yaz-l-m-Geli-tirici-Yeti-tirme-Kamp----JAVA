package week1;

public class JavaDersi14 {

	public static void main(String[] args) {
		
		String[] ��renciler=new String[4];
		��renciler[0]="Ali";
		��renciler[1]="Engin";
		��renciler[2]="Veli";
		��renciler[3]="Can";
		for(int i=0;i<��renciler.length;i++) {
			System.out.println(��renciler[i]);
		}
		
		System.out.println("--------------------------------------------------");
		
		for(String ogrenciler:��renciler) {
			System.out.println(ogrenciler);
		}
	}
}
