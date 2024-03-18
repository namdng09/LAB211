/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

import java.util.ArrayList;
import model.Candidate;

/**
 *
 * @author namdng09
 */
public class CandidateManager extends ListCandidate{
    private static CandidateManager instance;

    private CandidateManager() {}
    
    public static CandidateManager getInstance() {
        if (instance == null) {
            instance = new CandidateManager();
        }
        return instance;
    }
    
    public Candidate findByID(String candidateID) {
        return findFirst(new IIdentify<Candidate>() {
            @Override
            public boolean isFound(Candidate candidate) {
                return candidate.getId().equals(candidateID);
            }
        });
    }
    
    public Candidate findFirst(IIdentify<Candidate> identify) {
        for (Candidate candidate : this.listOfCandidates) {
            if (identify.isFound(candidate)) {
                return candidate;
            }
        }
        return null;
    }
    
    public ArrayList<Candidate> findbyPartOfName(String candidateName) {
        return findAll(new IIdentify<Candidate>() {
            @Override
            public boolean isFound(Candidate e) {
                return e.getFirstName().toLowerCase().contains(candidateName.toLowerCase())
                        || e.getLastName().toLowerCase().contains(candidateName.toLowerCase());
            }
        });
    }
    public ArrayList<Candidate> findbyNameAndType(String candidateName, int typeCandidate) {
        return findAll(new IIdentify<Candidate>() {
            @Override
            public boolean isFound(Candidate e) {
                return (e.getFirstName().toLowerCase().contains(candidateName.toLowerCase())
                        || e.getLastName().toLowerCase().contains(candidateName.toLowerCase())) && e.getTypeCandidate() == typeCandidate;
            }
        });
    }

    public ArrayList<Candidate> findAll(IIdentify<Candidate> identify) {
        ArrayList<Candidate> founded = new ArrayList<>();
        for (Candidate candidate : this.listOfCandidates) {
            if (identify.isFound(candidate)) {
                founded.add(candidate);
            }
        }
        return founded;
    }
    
    public void insert(Candidate candidate) throws Exception {
        if (this.findByID(candidate.getId()) != null) {
            throw new Exception("Candidate's code has been exist!");
        }
        this.listOfCandidates.add(candidate);
    } 
    
}
