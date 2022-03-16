package tech_department;

import super_department.superDepartment;

public class techDepartment extends superDepartment {
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String getTechStackInformation() {
		return "core Java";
	}
}
