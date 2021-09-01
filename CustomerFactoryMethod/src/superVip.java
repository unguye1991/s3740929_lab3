
public class superVip {
	private static superVip VideoStore;
	private superVip() {
		System.out.println("A superVip object is created");
	}
	
	public static superVip getInstance() {
		if(VideoStore==null) {
			VideoStore = new superVip();
		}
		
		return VideoStore;
	}

}
