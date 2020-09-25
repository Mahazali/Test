package demmo;

public class Connection {
	private static Connection instance;
	private Connection() {
		
	}
	public static Connection getinstance() {
		if(instance == null) {
			instance = new Connection();
			
		}
		return instance;
		
	}
	public void getData() {
		System.out.println("This is the data retrieved from database");
	}

}
