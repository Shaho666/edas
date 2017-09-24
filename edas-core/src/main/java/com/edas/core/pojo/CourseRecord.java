package com.edas.core.pojo;

import com.edas.orm.pojo.TbCourseRecord;

public class CourseRecord {

	private String courseRecordId;

	private String courseName;

	private String instructorName;

	private String studentId;

	public CourseRecord() {
	}

	public CourseRecord(TbCourseRecord courseRecord) {

		this.courseRecordId = courseRecord.getCourseRecordId();

		this.courseName = courseRecord.getCourseId();

		this.instructorName = courseRecord.getInstructorId();

		this.studentId = courseRecord.getStudentId();

	}

	public String getCourseRecordId() {
		return courseRecordId;
	}

	public void setCourseRecordId(String courseRecordId) {
		this.courseRecordId = courseRecordId;
	}

	public String getCourseId() {
		return courseName;
	}

	public void setCourseId(String courseId) {
		this.courseName = courseId;
	}

	public String getInstructorId() {
		return instructorName;
	}

	public void setInstructorId(String instructorId) {
		this.instructorName = instructorId;
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
		return "CourseRecord [courseRecordId=" + courseRecordId + ", courseId=" + courseName + ", instructorId="
				+ instructorName + ", studentId=" + studentId + "]";
	}

}
