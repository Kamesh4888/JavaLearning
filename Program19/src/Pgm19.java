class Machine {
	private String name;
	private int code;
	
	public Machine() {
		System.out.println("Constructor running");
		
		name = "kamesh";
		
	}
		
		public Machine(String name) {
			System.out.println("second constructor running");
			this.name = name;
			
		}
		
		public Machine(String name, int code) {
			System.out.println("Third constructor running");
			this.name = name;
			this.code = code;
			
		
		}
	}

public class Pgm19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine1 = new Machine();
		Machine machine2 = new Machine("lakshmi");
		Machine machine3 = new Machine("k", 0);
		
		
	}

}
