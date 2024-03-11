/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.Student;

/**
 *
 * @author namdng09
 */
public class ListStudents implements Iterable<Student>{
    protected ArrayList<Student> listOfStudents;

    public ListStudents() {
        this.listOfStudents = new ArrayList<>();
    }

    public ListStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    
    public ArrayList<Student> getList() {
        return listOfStudents;
    }
    
    public int size() {
        return this.listOfStudents.size();
    }
    
    public Student getStudent(int index) {
        return this.listOfStudents.get(index);
    }
    
    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    @Override
    public Iterator<Student> iterator() {
        return this.listOfStudents.iterator();
    }
}
