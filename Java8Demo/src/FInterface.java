
public interface FInterface {
	void add(int x);
	
	default public void getName(){
		System.out.println("Sagar");
	}

}
