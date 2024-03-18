/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.Candidate;

/**
 *
 * @author namdng09
 */
public class ListCandidate implements Iterable<Candidate>{
    protected ArrayList<Candidate> listOfCandidates;

    public ListCandidate() {
        this.listOfCandidates = new ArrayList<>();
    }

    public ListCandidate(ArrayList<Candidate> listOfCandidates) {
        this.listOfCandidates = listOfCandidates;
    }
    
    public ArrayList<Candidate> getListOfCandidates() {
        return listOfCandidates;
    }
    
    public int size() {
        return this.listOfCandidates.size();
    }
    
    public Candidate getCandidate(int index) {
        return this.listOfCandidates.get(index);
    }

    @Override
    public Iterator<Candidate> iterator() {
        return this.listOfCandidates.iterator();
    }
    
    
}
