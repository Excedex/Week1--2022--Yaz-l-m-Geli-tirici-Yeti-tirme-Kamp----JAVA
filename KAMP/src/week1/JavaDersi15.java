package week1;

public class JavaDersi15 {

	public static void main(String[] args) {
		double []myList= {1.2,1.3,2.5,3.1,3.2,5.6};
		double total=0;
		double max=0;
		for(double mylist:myList) {
			total=total+mylist;
			System.out.println(mylist);
			if(max<mylist) {
				max=mylist;
			}
		}
		
		System.out.println("The biggest number:"+ max);
		System.out.println("Total:"+ total);
	}

}
