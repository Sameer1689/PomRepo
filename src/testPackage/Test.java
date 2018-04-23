package testPackage;

public class Test {

	public static void main(String[] args) {
		 Bathroom b= new Bathroom();
	      b.setBathroom(5);
		 
		 House h = new House(b);
		 h.color();
 System.out.println(h.b.getBathroom());
				 
	}

}
