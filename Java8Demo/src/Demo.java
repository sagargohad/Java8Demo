
public class Demo {

	public static void main(String[] args) {
		FInterface fi = (x) -> System.out.print(2 * x +" ");
		
		fi.add(5);
		fi.getName();

	}

}
