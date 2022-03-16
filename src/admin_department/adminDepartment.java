package admin_department;

import super_department.superDepartment;

public class adminDepartment extends superDepartment {
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

}
