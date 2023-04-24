package productionline;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ViewFileInfo {
	public static void main(String[]args) throws FileNotFoundException, IOException {
		try (FileInputStream fis = new FileInputStream("D:/LineTests/TestResults.txt")){
			int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }   
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
