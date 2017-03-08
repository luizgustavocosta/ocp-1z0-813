package chapter2.patterns.creational.singleton;

public class HayStorage {

	private int quantity = 0;
	private HayStorage(){}
	
	// volatile
	// prevents subtle case where the compiler tries to optimize the code
	// such that the object is accessed before it is finished
	private static volatile HayStorage instance = null;
	//private static final HayStorage instance = new HayStorage();
	/*public static HayStorage getInstance() {
		return instance;
	}*/
	
	public static HayStorage getInstance(){
		if (instance == null){
			synchronized (HayStorage.class) {
				if (instance == null){
					instance = new HayStorage();
				}
			}
		}
		return instance;
	}
	
	public synchronized void addHay(int amount){
		quantity += amount;
	}
	
	public synchronized boolean removeHay(int amount){
		if (quantity < amount)
			return false;
		quantity -= amount;
		return true;
	}
	
	public synchronized int getHayQuantity(){
		return quantity;
	}
	
}
