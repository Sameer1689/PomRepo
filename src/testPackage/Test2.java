package testPackage;

public class Test2 {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.setBike(5);
         Car c =new Car(b);
         c.allCar();
        System.out.println(c.b.getBike());
	}

}
