import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects....");

		Person[] people = {}new Person(1, "Tariq"), new Person(2, "Arshath"), new Person(3, "Rafiq");
		
		try(FileOutputStream fs = new FileOutputStream("PeopleArray.ser")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(people);
		
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
