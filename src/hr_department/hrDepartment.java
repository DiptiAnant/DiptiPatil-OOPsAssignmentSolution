package hr_department;

import super_department.superDepartment;

public class hrDepartment extends superDepartment {
	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String doActivity() {
		return "team Lunch";
	}
}
