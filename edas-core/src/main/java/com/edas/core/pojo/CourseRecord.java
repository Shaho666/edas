package com.edas.core.pojo;

public class CourseRecord {

	private String courseRecordId;

    private String courseId;

    private String instructorId;
    
    private String studentId;

	public String getCourseRecordId() {
		return courseRecordId;
	}

	public void setCourseRecordId(String courseRecordId) {
		this.courseRecordId = courseRecordId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseRecordId == null) ? 0 : courseRecordId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseRecord other = (CourseRecord) obj;
		if (courseRecordId == null) {
			if (other.courseRecordId != null)
				return false;
		} else if (!courseRecordId.equals(other.courseRecordId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CourseRecord [courseRecordId=" + courseRecordId + ", courseId=" + courseId + ", instructorId="
				+ instructorId + ", studentId=" + studentId + "]";
	}
	
}
