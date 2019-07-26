package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

public static void main(String[] args) {
		
		try{
			FileReader fis = new FileReader("d:\\input2.txt");
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);	//읽어온 바이트륾 문자로 변환하여 출력한다.
			}
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} 
		
		
	}
}
