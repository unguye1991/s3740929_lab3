
public class superVip {
	private static superVip SuperVip;
	private superVip() {
		System.out.println("A superVip object is created");
	}
	
	public static superVip getInstance() {
		if(SuperVip==null) {
			SuperVip = new superVip();
		}
		
		return SuperVip;
	}

}
