
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReadCollection implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException
	{
		Set<Object> s=new HashSet<>();
		s.add("Anjali");
		s.add("abc");
		s.add("as");
		s.add("xyz");
		List<Object> lst = new ArrayList<>(s);
//public class ReadCollection {
	//public static void main(String[] args) {
		FileOutputStream fos = new FileOutputStream("A1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(lst);
		oos.close();
		System.out.println("App end");
		

	}

}
