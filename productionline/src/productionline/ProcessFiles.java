package productionline;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ProcessFiles {
	private Path p;
	private Path p2;
	private Path p3;
	private FileWriter fw;
	
	private static final ProcessFiles INSTANCE = new ProcessFiles();
	
	private ProcessFiles() {
		this.p = Paths.get("D:/LineTests");
		this.p2 = Paths.get("TestResults.txt");
		this.p3 = p.resolve(p2);
		CreateDirectory();
	}
	
	public static ProcessFiles getInstance() {
        return INSTANCE;
    }
	
	public void CreateDirectory() {
		try {
			deleteFile();
			if (Files.notExists(p)) {
				Files.createDirectory(p);
			}
			if (Files.notExists(p3)) {
				Files.createFile(p3);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void WriteFile(EmployeeInfo emp) throws IOException{
		String temp = "";
		FileOutputStream fos = new FileOutputStream(p3.toString(), true);
		temp = emp.toString()+"\n";
		byte[] buffer = temp.getBytes();
		fos.write(buffer, 0, buffer.length);
	}
	
	public void WriteFile(List<Product> products) throws IOException{
		FileOutputStream fos = new FileOutputStream(p3.toString(), true);
		String temp = "";
		for (Product prod : products) {
			temp += prod.toString()+"\n";
		}
		byte [] buffer = temp.getBytes();
		fos.write(buffer, 0, buffer.length);
	}
	
	public void deleteFile() {
		File file = p3.toFile();
		file.delete();
	}
}
