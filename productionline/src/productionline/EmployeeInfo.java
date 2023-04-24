package productionline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {
	private StringBuilder fullName;
	private String code;
	private Scanner sc;
	private String deptId;
	private Pattern p;
	
	public EmployeeInfo() {
		setFullName();
		getId();
		//sc.close();
	}

	public StringBuilder getFullName() {
		return fullName;
	}

	public void setFullName() {
		StringBuilder name;
		do {
			name = new StringBuilder(inputName());
			if (checkName(name)) {
				createEmployeeCode(name);
			}
			else if (!checkName(name) && !name.toString().contains(" ") && (Pattern.compile("[A-Za-z]+").matcher(name).matches())) {
				this.code = "Guest";
			}
		}while(!checkName(name) && !((!checkName(name) && !name.toString().contains(" "))&& (Pattern.compile("[A-Za-z]+").matcher(name).matches())));
		this.fullName = name;
	}
	
	private String inputName() {
		sc = new Scanner(System.in);
		String name = sc.nextLine();
		name = name.replaceAll(" +", " ");
		return name;
	}
	
	private void createEmployeeCode(StringBuilder name) {
		this.code = name.charAt(0) + name.substring(name.indexOf(" ")+1);
	}
	
	private boolean checkName(StringBuilder name) {
		if (Pattern.compile("[A-Za-z]+ [A-Za-z]+").matcher(name).matches()) {
			return true;
		}
		return false;
	}
	
	public String getCode() {
		return this.code;
	}
	
	private void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	private String getDeptId() {
		return deptId;
	}
	
	private String getId() {
		sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (validId(str)) {
			setDeptId(str);
		}
		else {
			setDeptId("None01");
		}
		return null;
	}
	
	private boolean validId(String id) {
		if (p.compile("[A-Z][a-z]{3}[0-9]{2}").matcher(id).matches()) {
			return true;
		}
		return false;
	}
	
	public String reverseString(String id) {
		char [] temp = id.toCharArray();
		String str = "";
		for (int i = 0; i < id.length(); i++) {
			temp[i] = (char)((int)temp[i] >> 1);
			str += temp[i];
		}
		return str;
	}
	
	@Override
	public String toString() {
		return "Employee name: "+ getFullName() + "\nEmployee code: " + getCode()+ "\nDeptId: "+getDeptId();
	}
}
