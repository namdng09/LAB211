/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author namdng09
 */
public class Student {
    private String studentID;
    private String studentName;
    private int semester;
    private String courseName;

    public Student() {
    }

    public Student(String studentID, String studentNameString, int semester, String courseName) {
        this.studentID = studentID;
        this.studentName = studentNameString;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentNameString(String studentNameString) {
        this.studentName = studentNameString;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
}
