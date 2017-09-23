package com.edas.orm.pojo;

import java.util.Date;

public class TbCourseRecord {
    private String courseRecordId;

    private String courseId;

    private String instructorId;

    private Date created;

    private String studentId;

    public String getCourseRecordId() {
        return courseRecordId;
    }

    public void setCourseRecordId(String courseRecordId) {
        this.courseRecordId = courseRecordId == null ? null : courseRecordId.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId == null ? null : instructorId.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }
}