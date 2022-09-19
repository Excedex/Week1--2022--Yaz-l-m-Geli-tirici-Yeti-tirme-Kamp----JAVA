package week1;

public class JavaDersi16 {

	public static void main(String[] args) {
		
		String [][] sehirler=new String[3][3];
		
		sehirler[0][0]="Kayseri";
		sehirler[0][1]="Sivas";
		sehirler[0][2]="Ankara";
		sehirler[1][0]="Malatya";
		sehirler[1][1]="Samsun";
		sehirler[1][2]="Afyon";
		sehirler[2][0]="Ýzmir";
		sehirler[2][1]="Mersin";
		sehirler[2][2]="Adana";
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
	}

}
