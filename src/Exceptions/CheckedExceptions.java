package Exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="VV/src/Exceptions";
		try {
		FileInputStream file=new FileInputStream(path);
		}
		catch(FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("All error handled");
		}
		
		
		
		

	}

}
