package productionline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDriver {
	public static void main(String[]args) throws IOException {
		AudioPlayer ap = new AudioPlayer("Apple iPod", "mp5");
		Screen sc = new Screen("600x400",40,22);
		MoviePlayer mp = new MoviePlayer("SamsungTV", MonitorType.LCD ,sc);
		AudioPlayer ap1 = new AudioPlayer("SamsungPlay", "mp3");
		AudioPlayer ap2 = new AudioPlayer("SonyBoy1337", "mp3");
		MoviePlayer mp1 = new MoviePlayer("MacintoshHD", MonitorType.LED ,sc);
		List<Product> list = new ArrayList<>(Arrays.asList(ap, ap1, mp, mp1, ap2));
		EmployeeInfo emp = new EmployeeInfo();
		EmployeeInfo emp1 = new EmployeeInfo();
//		ProcessFiles pf = new ProcessFiles();
//		System.out.println(emp);
//		System.out.println(emp1);
//		pf.WriteFile(emp);
//		pf.WriteFile(list);
		ProcessFiles.getInstance().CreateDirectory();
		ProcessFiles.getInstance().WriteFile(emp);
		ProcessFiles.getInstance().WriteFile(emp1);
		ProcessFiles.getInstance().WriteFile(list);
		
	}
}
