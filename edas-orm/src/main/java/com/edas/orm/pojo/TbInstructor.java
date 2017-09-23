package com.edas.orm.pojo;

public class TbInstructor {
    private String instructorId;

    private String instructorName;

    private String instructorPassword;

    private Integer instructorPlace;

    private String instructorTel;

    private String instructorEmail;

    private Integer instructorAge;

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId == null ? null : instructorId.trim();
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName == null ? null : instructorName.trim();
    }

    public String getInstructorPassword() {
        return instructorPassword;
    }

    public void setInstructorPassword(String instructorPassword) {
        this.instructorPassword = instructorPassword == null ? null : instructorPassword.trim();
    }

    public Integer getInstructorPlace() {
        return instructorPlace;
    }

    public void setInstructorPlace(Integer instructorPlace) {
        this.instructorPlace = instructorPlace;
    }

    public String getInstructorTel() {
        return instructorTel;
    }

    public void setInstructorTel(String instructorTel) {
        this.instructorTel = instructorTel == null ? null : instructorTel.trim();
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail == null ? null : instructorEmail.trim();
    }

    public Integer getInstructorAge() {
        return instructorAge;
    }

    public void setInstructorAge(Integer instructorAge) {
        this.instructorAge = instructorAge;
    }
}