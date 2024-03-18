/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Candidate;
import model.manager.CandidateManager;
import utility.Utility;
import view.CandidateManagementView;

/**
 *
 * @author namdng09
 */
public class SearchCandidate extends Form {
    CandidateManagementView view = new CandidateManagementView();
    Utility utils = new Utility();
    
    @Override
    public STATUS_PROGRAM setup() {
        ArrayList<Candidate> searchCandidates = new ArrayList<>();
        CandidateManager manager = CandidateManager.getInstance();
        view.displayAllNameCandidate(manager);
        
        String searchName = utils.getNameString(
                "Input Candidate name (First name or Last name): ");
        
        int typeCandidate = utils.getInteger("Input type of candidate: ", 0, 2);
        
        searchCandidates = manager.findbyNameAndType(searchName, typeCandidate);
        
        for (Candidate searchCandidate : searchCandidates) {
            System.out.println(searchCandidate.toString());
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
