package com.edas.orm.pojo;

public class TbCourseType {
    private Integer courseTypeId;

    private String courseTypeName;

    public Integer getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(Integer courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getCourseTypeName() {
        return courseTypeName;
    }

    public void setCourseTypeName(String courseTypeName) {
        this.courseTypeName = courseTypeName == null ? null : courseTypeName.trim();
    }
}