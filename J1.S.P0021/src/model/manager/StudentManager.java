/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;
import model.Student;

/**
 *
 * @author namdng09
 */
public class StudentManager extends ListStudents implements IFind<Student>, IInsert<Student>{
    
    private static StudentManager instance;
    
    private StudentManager(){}
    
    public static StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }
    
    public Student findByID(String studentID) {
        return findFirst(new IIdentify<Student>() {
            @Override
            public boolean isFound(Student student) {
                return student.getStudentID().equals(studentID);
            }
        });
    }
    
    public ArrayList<Student> findbyPartOfName(String studentName) {
        return findAll(new IIdentify<Student>() {
            @Override
            public boolean isFound(Student e) {
                return e.getStudentName().toLowerCase().contains(studentName.toLowerCase());
            }
        });
    }

    @Override
    public Student findFirst(IIdentify<Student> identify) {
        for (Student student : this.listOfStudents) {
            if (identify.isFound(student)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> findAll(IIdentify<Student> identify) {
        ArrayList<Student> founded = new ArrayList<>();
        for (Student student : this.listOfStudents) {
            if (identify.isFound(student)) {
                founded.add(student);
            }
        }
        return founded;
    }

    @Override
    public void insert(Student student) throws Exception {
        if (this.findByID(student.getStudentID()) != null) {
            throw new Exception("Student's code has been exist!");
        }
        this.listOfStudents.add(student);
    }
    
    public void delete(Student student) throws Exception {
        if (this.findByID(student.getStudentID()) == null) {
            throw new Exception("Student's code has not been exist!");
        }
        this.listOfStudents.remove(student);
    }
}
