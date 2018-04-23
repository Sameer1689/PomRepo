package testPackage;

public class Test4 {
	
	public static void main(String[] args) {
		
		Car1 c =new Car1();
		
		c.carmodel="alto";
		
		c.reg=new Registration();
		
		c.reg.regno="dl1234";
		
		System.out.println(c.reg.regno);
		
	}

}
