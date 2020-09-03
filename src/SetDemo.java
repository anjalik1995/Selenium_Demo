import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("Anjali");
		s.add("sneha");
		s.add("Priyanka");
		
		for(String val:s)
		{
			System.out.println(val);
		}
		String name="sneha";
		s.remove(name);
		System.out.println("================================");
		for(String val:s)
		{
			System.out.println(val);
		}
	}

}
