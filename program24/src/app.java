
public class app {

	public static void main(String[] args) {
		machine mach1 = new machine();
		
		mach1.start();
		mach1.stop();
		
		vehicle car=new vehicle();
		car.vehicleColor();
		car.start();
		car.stop();
		car.showInfo();
		car.info();

	}

}
