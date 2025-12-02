package introductionToJava.oopsAssignment.student;

public class Student {
	private int rollNo;
	private String name;
	private String subject;
	private int mark;
	private String feedBack;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		if (mark >= 0 && mark <= 100) {
			this.mark = mark;
		} else {
			System.out.println("Invalid mark : Mark should be Zero to Hundred only...");
		}
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

}
